package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class PermissionDto {
    private int permissionID;
    private String name;
    private String status;
    private boolean trash;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
