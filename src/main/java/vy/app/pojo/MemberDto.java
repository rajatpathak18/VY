package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

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
    private String profession;
    private int practiceLevel;
    private String sendEmail;
    private String callFlag;
    private String sms;
    private String patrikaSubscribed;
    private String updeshtaMemberID;
    private String updeshVenue;
    private String status;
    private boolean trash;
    private Date createDate;
    private Date updateDate;
    private String createSource;
    private String updateSource;
}
