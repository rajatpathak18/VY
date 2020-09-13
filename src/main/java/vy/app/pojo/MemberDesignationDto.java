package vy.app.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vy.app.model.Designation;
import vy.app.model.Member;
import vy.app.model.MemberDesignationID;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class MemberDesignationDto {
    private MemberDesignationIDDto memberDesignationID;
    @ToString.Exclude()
    @JsonIgnoreProperties(value = "memberDesignations")
    private MemberDto member;
    @ToString.Exclude()
    @JsonIgnoreProperties(value = "memberDesignations")
    private DesignationDto designation;
    private Date honourDate;
    private boolean isGlobal;
    private Date dismissDate;
    private boolean status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
