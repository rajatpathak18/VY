package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
@ToString
public class RoleDto {
    private Long roleID;
    private String name;
    private String status;
    private boolean trash;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Set<PermissionDto> permissions;
}
