package vy.app.controller;

import lombok.extern.log4j.Log4j2;
import net.kaczmarzyk.spring.data.jpa.domain.*;
import net.kaczmarzyk.spring.data.jpa.web.annotation.*;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Conjunction;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Join;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpRequest;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import vy.app.pojo.MemberDetailsDto;
import vy.app.pojo.MemberDto;
import vy.app.model.Member;
import vy.app.pojo.MemberListDto;
import vy.app.pojo.UpdeshSummaryDto;
import vy.app.security.VyUserDetails;
import vy.app.service.MemberService;
import vy.app.service.ReportService;
import vy.app.service.RoleService;
import vy.app.validation.Validation;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private Validation<MemberDto> memberDtoValidation;

    @PostMapping(value = "/member/")
    @ResponseStatus(code = HttpStatus.CREATED)
    public MemberDetailsDto createMember(@Valid @RequestBody MemberDetailsDto memberDetailsDto) throws Exception {
        log.info("createMember: " + memberDetailsDto.toString());
        return convertToDetailsDto(memberService.createMember(convertToEntity(memberDetailsDto)));
    }

    @GetMapping(value = "/member/")
    @ResponseStatus(HttpStatus.OK)
    public Page<MemberDto> getMembers(
            @Join(path = "memberDesignations", alias = "md")
            @Conjunction({
                    @Or(@Spec(path = "memberID", params = "memberID", spec = Equal.class)),
                    @Or(@Spec(path = "firstName", params = "firstName", spec = LikeIgnoreCase.class)),
                    @Or(@Spec(path = "middleName", params = "middleName", spec = LikeIgnoreCase.class)),
                    @Or(@Spec(path = "lastName", params = "lastName", spec = LikeIgnoreCase.class)),
                    @Or(@Spec(path = "email.emailAddress1", params = "email", spec = LikeIgnoreCase.class)),
                    @Or({@Spec(path = "address.country", params = "country", spec = LikeIgnoreCase.class),
                            @Spec(path = "address.alternateCountry", params = "country", spec = LikeIgnoreCase.class)}),
                    @Or({@Spec(path = "address.state", params = "state", spec = LikeIgnoreCase.class),
                            @Spec(path = "address.alternateState", params = "state", spec = LikeIgnoreCase.class)}),
                    @Or({@Spec(path = "address.city", params = "city", spec = LikeIgnoreCase.class),
                            @Spec(path = "address.alternateCity", params = "city", spec = LikeIgnoreCase.class)}),
                    @Or(@Spec(path = "md.designation.designationName", params = "designation", spec = LikeIgnoreCase.class)),
                    @Or(@Spec(path = "updeshtaMemberID", params = "updeshtaMemberID", spec = Equal.class)),
                    @Or(@Spec(path = "associatedSince", params = {"associatedAfter", "associatedBefore"}, spec = Between.class)),
                    @Or({@Spec(path = "primaryPhoneNumber", params = "phNumber", spec = Like.class),
                            @Spec(path = "alternatePhoneNumber", params = "phNumber", spec = Like.class)})
            }) Specification<Member> spec, @PageableDefault(size = 5, sort = "memberID") Pageable pageable, Authentication authentication) {
        log.info("getMembers: printing roles " + ((VyUserDetails) authentication.getPrincipal()).getRoles());

        if (roleService.hasOnlyUpdeshtaRole(((VyUserDetails) authentication.getPrincipal()).getRoles())) {
            log.info("reaching here ");
            Specification<Member> roleBased = new Specification<Member>() {
                @Override
                public Predicate toPredicate(Root<Member> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                    return criteriaBuilder.equal(root.get("updeshtaMemberID"), ((VyUserDetails) authentication.getPrincipal()).getUsername());
                }
            };
            spec = spec.and(roleBased);
        }
        
        Page<Member> members = memberService.getMembers(spec, pageable);
        return members.map(this::convertToDto);
    }

    @GetMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public MemberDetailsDto getMember(@PathVariable Long id) throws Exception {
        log.info("getMember: memberID " + id);
        return convertToDetailsDto(memberService.getMember(id));
    }

    @GetMapping(value = "/member/-/updeshsummary/")
    @ResponseStatus(HttpStatus.OK)
    public List<UpdeshSummaryDto> getUpdeshSummary(@RequestParam(required = false) Long updeshtaMemberID,
                                                   @RequestParam() String associatedAfter,
                                                   @RequestParam() String associatedBefore) throws Exception{
        log.info("getUpdeshSummary: updeshtaMemberID: " + updeshtaMemberID + ", associatedAfter: " + associatedAfter + "associatedBefore: " + associatedBefore);
        return memberService.getUpdeshSummary(updeshtaMemberID, associatedAfter, associatedBefore);
    }

    @GetMapping(value = "/member/-/updeshtalist/")
    @ResponseStatus(HttpStatus.OK)
    public List<MemberListDto> getUpdeshtaList() throws Exception {
        log.info("reaching here");
        List<Member> members = memberService.getUpdeshtaMemberList();
        return members.stream().map(this::convertToMemberListDto).collect(Collectors.toList());
    }

    @PutMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    MemberDetailsDto updateMember(@RequestBody MemberDetailsDto memberDetailsDto, @PathVariable Long id) throws Exception {
        log.info("updateMember: memberID " + id);
        return convertToDetailsDto(memberService.updateMember(id, convertToEntity(memberDetailsDto)));
    }

    @DeleteMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteMember(@PathVariable Long id) throws Exception {
        log.info("deleteMember: memberID " + id);
        memberService.deleteMember(id);
    }

    private MemberDto convertToDto(Member member) {
//        System.out.println("printing sunny------------------1" + member.toString());
        MemberDto memberDto = modelMapper.map(member, MemberDto.class);
//        System.out.println("printing sunny------------------2" + memberDto.toString());
        return memberDto;
    }

    private MemberDetailsDto convertToDetailsDto(Member member) {
//        System.out.println("printing sunny------------------1" + member.toString());
        MemberDetailsDto memberDetailsDto = modelMapper.map(member, MemberDetailsDto.class);
//        System.out.println("printing sunny------------------2" + memberDto.toString());
        return memberDetailsDto;
    }

    private MemberListDto convertToMemberListDto(Member member) {
//        System.out.println("printing sunny------------------1" + member.toString());
        MemberListDto memberListDto = modelMapper.map(member, MemberListDto.class);
//        System.out.println("printing sunny------------------2" + memberDto.toString());
        return memberListDto;
    }

    private Member convertToEntity(MemberDetailsDto memberDetailsDto) {
        Member member = modelMapper.map(memberDetailsDto, Member.class);
        return member;
    }

    private Member convertToEntity(MemberDto memberDto) {
        Member member = modelMapper.map(memberDto, Member.class);
        return member;
    }

    public static Specification<Member> getEmployeesByNameSpec(String name) {
        return new Specification<Member>() {
            @Override
            public Predicate toPredicate(Root<Member> root,
                                         CriteriaQuery<?> query,
                                         CriteriaBuilder criteriaBuilder) {
                Predicate equalPredicate = criteriaBuilder.equal(root.get("updeshtaMemberID"), name);
                return equalPredicate;
            }
        };
    }
}
