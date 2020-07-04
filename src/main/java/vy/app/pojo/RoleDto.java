package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.util.Set;

@Getter
@Setter
@ToString
public class RoleDto {
    private int roleID;
    private String name;
    private String status;
    private boolean trash;
    private Date createDate;
    private Date updateDate;
    private Set<PermissionDto> permissions;
}
