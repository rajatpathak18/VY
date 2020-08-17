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
public class MemberDetailsDto {
    private Long memberID;

    @Size(min = 1, max = 60, message = "firstName size must be between 1 and 60")
    @NotBlank(message = "firstName is mandatory")
    private String firstName;

    private String middleName;

    @NotBlank(message = "lastName is mandatory")
    private String lastName;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "dateOfBirth is mandatory")
    private Date dateOfBirth;

    @NotBlank(message = "gender is mandatory")
    private String gender;

    private String motherName;
    private String fatherName;
    private String primaryPhoneNumber;
    private String alternatePhoneNumber;
    //    private String govtID;
//    private String govtIDType;
    private String nationality;
    private MemberPhotoDto memberPhoto;
    //    private String memberPhotoPath;
//    private String govtIDPhotoPath;
    private Date associatedSince;
    private AddressDto address;
    private EmailDto email;
    private AkshayPatraDto akshayPatra;
    @JsonIgnoreProperties(value = "member")
    @ToString.Exclude()
    private Set<MemberDesignationDto> memberDesignations;
    private String profession;
    @NotNull(message = "practiceLevel is mandatory")
    @Min(value = 1, message = "practiceLevel must be equal or greater than 1")
    @Max(value = 5, message = "practiceLevel must be equal or less than 5")
    private int practiceLevel;
    @NotNull(message = "sendEmail is mandatory")
    private boolean sendEmail;
    @NotNull(message = "callFlag is mandatory")
    private boolean callFlag;
    @NotNull(message = "sms is mandatory")
    private boolean sms;
    @NotNull(message = "patrikaSubscribed is mandatory")
    private boolean patrikaSubscribed;
    @NotNull(message = "hasSwarved is mandatory")
    private boolean hasSwarved;
    private Long updeshtaMemberID;
    private String updeshtaName;
    private String updeshVenue;
    private boolean status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private String createSource;
    private String updateSource;
}
