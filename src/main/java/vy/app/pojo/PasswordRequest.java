package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PasswordRequest {
    String oldPassword;
    String newPassword;
}
