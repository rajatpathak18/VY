package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vy.app.model.Member;
import vy.app.model.Role;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Getter
@Setter
@ToString
public class UserDto {
    private int userID;
    private Member member;
    private String username;
    private String password;
    private String status;
    private boolean trash;
    private Date createDate;
    private Date updateDate;
    private Set<RoleDto> roles;
}
