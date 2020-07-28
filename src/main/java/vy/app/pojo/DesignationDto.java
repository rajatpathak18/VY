package vy.app.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vy.app.model.Member;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
@ToString
public class DesignationDto {
    private Long designationID;
    @NotEmpty(message = "Designation name is mandatory")
    private String designationName;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}