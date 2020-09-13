package vy.app.controller;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vy.app.model.MemberDesignation;
import vy.app.model.MemberDesignationID;
import vy.app.pojo.MemberDesignationDto;
import vy.app.pojo.MemberDesignationIDDto;
import vy.app.service.MemberDesignationService;

@Log4j2
@RestController
public class MemberDesignationController {

    @Autowired
    private MemberDesignationService memberDesignationService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(value = "/member/{memberID}/designation/{designationID}/")
    @ResponseStatus(HttpStatus.CREATED)
    public MemberDesignationDto createMemberDesignation(@RequestBody MemberDesignationDto memberDesignationDto, @PathVariable Long memberID, @PathVariable Long designationID) throws Exception {
        log.info("createMemberDesignation: memberID " + memberID + " designationID: " + designationID + ", request: " + memberDesignationDto.toString());
        MemberDesignationIDDto memberDesignationIDDto = new MemberDesignationIDDto(memberID, designationID);
        memberDesignationDto.setMemberDesignationID(memberDesignationIDDto);
        return convertToDto(memberDesignationService.createMemberDesignation(convertToEntity(memberDesignationDto)));
    }

    @GetMapping(value = "/member/{memberID}/designation/{designationID}/")
    @ResponseStatus(HttpStatus.OK)
    public MemberDesignationDto getMemberDesignation(@PathVariable Long memberID, @PathVariable Long designationID) throws Exception {
        log.info("getMemberDesignation: memberID " + memberID + " designationID: " + designationID);
        MemberDesignationID memberDesignationID = new MemberDesignationID(memberID, designationID);
        return convertToDto(memberDesignationService.getMemberDesignation(memberDesignationID));
    }

    @PutMapping(value = "/member/{memberID}/designation/{designationID}/")
    @ResponseStatus(HttpStatus.OK)
    MemberDesignationDto updateMemberDesignation(@RequestBody MemberDesignationDto memberDesignationDto, @PathVariable Long memberID, @PathVariable Long designationID) throws Exception {
        log.info("updateMemberDesignation: memberID " + memberID + " designationID: " + designationID + ", request: " + memberDesignationDto.toString());
        MemberDesignationID memberDesignationID = new MemberDesignationID(memberID, designationID);
        return convertToDto(memberDesignationService.updateMemberDesignation(memberDesignationID, convertToEntity(memberDesignationDto)));
    }

    @DeleteMapping(value = "/member/{memberID}/designation/{designationID}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteMemberDesignation(@PathVariable Long memberID, @PathVariable Long designationID) throws Exception {
        log.info("deleteMemberDesignation: memberID " + memberID + " designationID: " + designationID);
        MemberDesignationID memberDesignationID = new MemberDesignationID(memberID, designationID);
        memberDesignationService.deleteMemberDesignation(memberDesignationID);
    }

    private MemberDesignationDto convertToDto(MemberDesignation memberDesignation) {
        MemberDesignationDto memberDesignationDto = modelMapper.map(memberDesignation, MemberDesignationDto.class);
        return memberDesignationDto;
    }

    private MemberDesignation convertToEntity(MemberDesignationDto memberDesignationDto) {
        MemberDesignation memberDesignation = modelMapper.map(memberDesignationDto, MemberDesignation.class);
        return memberDesignation;
    }
}
