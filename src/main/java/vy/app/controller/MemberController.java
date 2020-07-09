package vy.app.controller;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.domain.Like;
import net.kaczmarzyk.spring.data.jpa.domain.LikeIgnoreCase;
import net.kaczmarzyk.spring.data.jpa.web.annotation.*;
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
import vy.app.pojo.MemberDto;
import vy.app.model.Member;
import vy.app.service.MemberService;
import vy.app.validation.Validation;

import javax.validation.Valid;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private Validation<MemberDto> memberDtoValidation;

    @PostMapping(value = "/member/")
    @ResponseStatus(HttpStatus.CREATED)
    public MemberDto createMember(@Valid @RequestBody MemberDto memberDto) throws Exception {
//        memberDtoValidation.validate(memberDto);
        return convertToDto(memberService.createMember(convertToEntity(memberDto)));
    }

    @GetMapping(value = "/member/")
    @ResponseStatus(HttpStatus.OK)
    public Page<MemberDto> getMembers(@Conjunction({
            @Or(@Spec(path = "memberID", params = "memberID", spec = Equal.class)),
            @Or(@Spec(path = "firstName", params = "firstName", spec = LikeIgnoreCase.class)),
            @Or(@Spec(path = "middleName", params = "middleName", spec = LikeIgnoreCase.class)),
            @Or(@Spec(path = "lastName", params = "lastName", spec = LikeIgnoreCase.class)),
            @Or({@Spec(path = "primaryPhoneNumber", params = "phNumber", spec = Equal.class),
                    @Spec(path = "alternatePhoneNumber", params = "phNumber", spec = Equal.class)})
    }) Specification<Member> spec, @PageableDefault(size = 5, sort = "memberID") Pageable pageable) {
        Page<Member> members = memberService.getMembers(spec, pageable);
        return members.map(this::convertToDto);
    }

    @GetMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public MemberDto getMember(@PathVariable Long id) {
        return convertToDto(memberService.getMember(id));
    }

    @PutMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    MemberDto updateMember(@RequestBody MemberDto memberDto, @PathVariable Long id) {
        return convertToDto(memberService.updateMember(id, convertToEntity(memberDto)));
    }

    @PostMapping(value = "/member/{id}/designation/")
    @ResponseStatus(HttpStatus.OK)
    MemberDto updateDesignation(@RequestBody MemberDto memberDto, @PathVariable Long id) {
        return convertToDto(memberService.updateDesignation(id, convertToEntity(memberDto)));
    }

    @DeleteMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteMember(@PathVariable Long id) {
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
