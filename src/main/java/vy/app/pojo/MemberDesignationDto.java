package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vy.app.model.Designation;
import vy.app.model.Member;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class MemberDesignationDto {
    private Long memberDesignationID;
    private Member member;
    private Designation designation;
    private Date honourDate;
    private boolean isGlobal;
    private Date dismissDate;
    private boolean status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
