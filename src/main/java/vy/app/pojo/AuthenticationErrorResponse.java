package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthenticationErrorResponse extends AuthenticationResponse {
    private String error;
    private String errorDescription;

    public AuthenticationErrorResponse(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;
    }
}