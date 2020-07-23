package vy.app.Exception;

import org.springframework.http.HttpStatus;

public interface Exceptions {
    APIException MemberFirstNameNullEmptyException = new APIException("First name cannot be null or empty", "/member", HttpStatus.BAD_REQUEST);
    APIException MemberLastNameNullEmptyException = new APIException("Last name cannot be null or empty", "/member", HttpStatus.BAD_REQUEST);

    APIException UserMemberNullException = new APIException("Member cannot be null", "/user", HttpStatus.BAD_REQUEST);
    APIException UserMemberIDInvalidException = new APIException("Invalid member id", "/user", HttpStatus.BAD_REQUEST);
    APIException UserAlreadyExists = new APIException("Account for this member already exists", "", HttpStatus.BAD_REQUEST);

    APIException UserIncorrectOldPasswordException = new APIException("Incorect old passowrd", "", HttpStatus.BAD_REQUEST);

    APIException MemberDesignationAlreadyExists = new APIException("Designation is already assigned to this member.", "", HttpStatus.BAD_REQUEST);
    APIException MemberDesignationDoesNotExist = new APIException("Designation is not assigned to this member.", "", HttpStatus.BAD_REQUEST);
}

