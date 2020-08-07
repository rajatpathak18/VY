package vy.app.controller;

import lombok.extern.log4j.Log4j2;
import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vy.app.pojo.MemberDesignationDto;
import vy.app.pojo.MemberDto;
import vy.app.model.Member;
import vy.app.service.MemberService;
import vy.app.validation.Validation;

import javax.validation.Valid;

@Log4j2
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private Validation<MemberDto> memberDtoValidation;

    @PostMapping(value = "/member/")
    @ResponseStatus(code = HttpStatus.CREATED)
    public MemberDto createMember(@Valid @RequestBody MemberDto memberDto) throws Exception {
        log.info("createMember: " + memberDto.toString());
        return convertToDto(memberService.createMember(convertToEntity(memberDto)));
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
                    @Or(@Spec(path = "md.designation.designationName", params = "designation", spec = LikeIgnoreCase.class)),
                    @Or({@Spec(path = "primaryPhoneNumber", params = "phNumber", spec = Like.class),
                            @Spec(path = "alternatePhoneNumber", params = "phNumber", spec = Like.class)})
            }) Specification<Member> spec, @PageableDefault(size = 5, sort = "memberID") Pageable pageable) {
        log.info("getMembers: " + spec);
        Page<Member> members = memberService.getMembers(spec, pageable);
        return members.map(this::convertToDto);
    }

    @GetMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public MemberDto getMember(@PathVariable Long id) throws Exception {
        log.info("getMember: memberID " + id);
        return convertToDto(memberService.getMember(id));
    }

    @PutMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    MemberDto updateMember(@RequestBody MemberDto memberDto, @PathVariable Long id) throws Exception {
        log.info("updateMember: memberID " + id);
        return convertToDto(memberService.updateMember(id, convertToEntity(memberDto)));
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

    private Member convertToEntity(MemberDto memberDto) {
        Member member = modelMapper.map(memberDto, Member.class);
        return member;
    }
}
