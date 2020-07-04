package vy.app.Exception;

import org.springframework.http.HttpStatus;

public class Exceptions {
    public static APIException MemberFirstNameNullEmptyException = new APIException("First name cannot be null or empty", "/member", HttpStatus.BAD_REQUEST);
    public static APIException MemberLastNameNullEmptyException = new APIException("Last name cannot be null or empty", "/member", HttpStatus.BAD_REQUEST);
}

