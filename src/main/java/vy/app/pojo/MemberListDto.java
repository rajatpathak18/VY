package vy.app.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
@ToString
public class MemberListDto {
    private Long memberID;

    @Size(min = 1, max = 60, message = "firstName size must be between 1 and 60")
    @NotBlank(message = "firstName is mandatory")
    private String firstName;

    private String middleName;

    @NotBlank(message = "lastName is mandatory")
    private String lastName;

    private AddressDto address;
}
