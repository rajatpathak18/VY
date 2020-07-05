package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import vy.app.model.Designation;

import java.sql.Date;
import java.util.Set;

@Getter
@Setter
@ToString
public class MemberDto {
    private int memberID;
    private String firstName;
    private String middleName;
    private String lastName;
    private Date dateOfBirth;
    private String gender;
    private String motherName;
    private String fatherName;
    private String primaryPhoneNumber;
    private String alternatePhoneNumber;
    private String govtID;
    private String govtIDType;
    private String nationality;
    private String memberPhotoPath;
    private String govtIDPhotoPath;
    private Date associatedSince;
    private AddressDto address;
    private EmailDto email;
    private AkshayPatraDto akshayPatra;
    private Set<Designation> designation;
    private String profession;
    private int practiceLevel;
    private boolean sendEmail;
    private boolean callFlag;
    private boolean sms;
    private boolean patrikaSubscribed;
    private boolean hasSwarved;
    private String updeshtaMemberID;
    private String updeshtaName;
    private String updeshVenue;
    private boolean status;
    private Date createDate;
    private Date updateDate;
    private String createSource;
    private String updateSource;
}
