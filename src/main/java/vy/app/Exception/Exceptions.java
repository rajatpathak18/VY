package vy.app.Exception;

import org.springframework.http.HttpStatus;

public interface Exceptions {
    APIException MemberFirstNameNullEmptyException = new APIException("First name cannot be null or empty", "/member", HttpStatus.BAD_REQUEST);
    APIException MemberLastNameNullEmptyException = new APIException("Last name cannot be null or empty", "/member", HttpStatus.BAD_REQUEST);

    APIException UserMemberNullException = new APIException("Member cannot be null", "/user", HttpStatus.BAD_REQUEST);
    APIException UserMemberIDInvalidException = new APIException("Invalid Member id", "/user", HttpStatus.BAD_REQUEST);
}

