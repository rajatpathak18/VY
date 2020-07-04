package vy.app.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vy.app.pojo.MemberDto;
import vy.app.model.Member;
import vy.app.service.MemberService;
import vy.app.validation.Validation;

import java.util.List;
import java.util.stream.Collectors;

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
    public MemberDto createMember(@RequestBody MemberDto memberDto) throws Exception {
        memberDtoValidation.validate(memberDto);
        return convertToDto(memberService.createMember(convertToEntity(memberDto)));
    }

    @GetMapping(value = "/member/")
    @ResponseStatus(HttpStatus.OK)
    public List<MemberDto> getMembers() {
        List<Member> members = memberService.getMembers();
        return members.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @GetMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public MemberDto getMember(@PathVariable int id) {
        return convertToDto(memberService.getMember(id));
    }

    @PutMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    MemberDto updateMember(@RequestBody MemberDto memberDto, @PathVariable int id) {
        return convertToDto(memberService.updateMember(id, convertToEntity(memberDto)));
    }

    @DeleteMapping(value = "/member/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteMember(@PathVariable int id) {
        memberService.deleteMember(id);
    }

    private MemberDto convertToDto(Member member) {
        MemberDto memberDto = modelMapper.map(member, MemberDto.class);
        return memberDto;
    }

    private Member convertToEntity(MemberDto memberDto) {
        Member member = modelMapper.map(memberDto, Member.class);
        return member;
    }
}
