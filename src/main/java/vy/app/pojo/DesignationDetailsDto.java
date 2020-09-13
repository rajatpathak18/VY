package vy.app.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
@ToString
public class DesignationDetailsDto extends DesignationDto {
    @JsonIgnoreProperties(value = "designation")
    @ToString.Exclude()
    private Set<MemberDesignationDto> memberDesignations;
}