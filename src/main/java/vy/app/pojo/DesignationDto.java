package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vy.app.model.Member;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
@ToString
public class DesignationDto {
    private Long designationID;
    private String designationName;
    private boolean status;
    private boolean trash;
    private Timestamp createdAt;
    private Timestamp updatedAt;
//    private Set<Member> members;
}