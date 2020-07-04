package vy.app.validation;

import vy.app.Exception.Exceptions;
import vy.app.pojo.MemberDto;


public class MemberValidation implements Validation<MemberDto> {

    @Override
    public void validate(MemberDto member) throws Exception {
        // check if the required params are not null
        System.out.println("printing sunny----" + member.toString());
        if (member.getFirstName() == null || member.getFirstName().isEmpty()) {
            throw Exceptions.MemberFirstNameNullEmptyException;
        }

        if (member.getLastName() == null || member.getLastName().isEmpty()) {
            throw Exceptions.MemberLastNameNullEmptyException;
        }


    }
}
