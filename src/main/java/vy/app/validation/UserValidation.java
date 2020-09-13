package vy.app.validation;

import vy.app.Exception.Exceptions;
import vy.app.pojo.UserDto;


public class UserValidation implements Validation<UserDto> {

    @Override
    public void validate(UserDto user) throws Exception {
        // check if the required params are not null
        System.out.println("printing sunny----" + user.toString());
        if (user.getMember() == null)
            throw Exceptions.UserMemberNullException;

        if (user.getMember().getMemberID() == 0)
            throw Exceptions.UserMemberIDInvalidException;

    }
}
