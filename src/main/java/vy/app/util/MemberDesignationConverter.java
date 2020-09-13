package vy.app.util;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import vy.app.model.MemberDesignation;
import vy.app.model.User;
import vy.app.pojo.MemberDesignationDto;
import vy.app.pojo.MemberDesignationIDDto;
import vy.app.pojo.UserDto;

@Component
public class MemberDesignationConverter {

    @Autowired
    private ModelMapper modelMapper;

    public MemberDesignationDto convertToDto(MemberDesignation memberDesignation) {
        MemberDesignationDto memberDesignationIDDto = modelMapper.map(memberDesignation, MemberDesignationDto.class);
        return memberDesignationIDDto;
    }

    public MemberDesignation convertToEntity(MemberDesignationDto memberDesignationDto) {
        MemberDesignation memberDesignation = modelMapper.map(memberDesignationDto, MemberDesignation.class);
        return memberDesignation;
    }
}
