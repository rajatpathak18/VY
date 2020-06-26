package vy.app.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "vy_member")
public class Member {
    @Column(name = "member_id")
    @Id
    @GeneratedValue
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private Date dob;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phone_no")
    private String phoneNumber;

    @Column(name = "alternate_phone_no")
    private String alternatePhoneNumber;

    @Column(name = "government_id")
    private String govtID;

    @Column(name = "government_id_type")
    private String govtIDType;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "member_photo_path")
    private String memberPhotoPath;

    @Column(name = "govt_id_photo_path")
    private String govtIDPhotoPath;

    @Column(name = "associated_since")
    private Date associatedSince;

    @Column(name = "profession")
    private String profession;

    @Column(name = "practice_level")
    private int practiceLevel;

    @Column(name = "send_email")
    private String sendEmail;

    @Column(name = "call_flag")
    private String callFlag;

    @Column(name = "sms")
    private String sms;

    @Column(name = "patrika_subscribed")
    private String patrikaSubscribed;

    @Column(name = "updeshta_member_id")
    private String updeshtaMemberID;

    @Column(name = "status")
    private String status;

    @Column(name = "trash")
    private boolean trash;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

    @Column(name = "create_source")
    private String createSource;

    @Column(name = "update_source")
    private String updateSource;

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", alternatePhoneNumber='" + alternatePhoneNumber + '\'' +
                ", govtID='" + govtID + '\'' +
                ", govtIDType='" + govtIDType + '\'' +
                ", nationality='" + nationality + '\'' +
                ", memberPhotoPath='" + memberPhotoPath + '\'' +
                ", govtIDPhotoPath='" + govtIDPhotoPath + '\'' +
                ", associatedSince=" + associatedSince +
                ", profession='" + profession + '\'' +
                ", practiceLevel=" + practiceLevel +
                ", sendEmail='" + sendEmail + '\'' +
                ", callFlag='" + callFlag + '\'' +
                ", sms='" + sms + '\'' +
                ", patrikaSubscribed='" + patrikaSubscribed + '\'' +
                ", updeshtaMemberID='" + updeshtaMemberID + '\'' +
                ", status='" + status + '\'' +
                ", trash=" + trash +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", createSource='" + createSource + '\'' +
                ", updateSource='" + updateSource + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAlternatePhoneNumber() {
        return alternatePhoneNumber;
    }

    public void setAlternatePhoneNumber(String alternatePhoneNumber) {
        this.alternatePhoneNumber = alternatePhoneNumber;
    }

    public String getGovtID() {
        return govtID;
    }

    public void setGovtID(String govtID) {
        this.govtID = govtID;
    }

    public String getGovtIDType() {
        return govtIDType;
    }

    public void setGovtIDType(String govtIDType) {
        this.govtIDType = govtIDType;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getMemberPhotoPath() {
        return memberPhotoPath;
    }

    public void setMemberPhotoPath(String memberPhotoPath) {
        this.memberPhotoPath = memberPhotoPath;
    }

    public String getGovtIDPhotoPath() {
        return govtIDPhotoPath;
    }

    public void setGovtIDPhotoPath(String govtIDPhotoPath) {
        this.govtIDPhotoPath = govtIDPhotoPath;
    }

    public Date getAssociatedSince() {
        return associatedSince;
    }

    public void setAssociatedSince(Date associatedSince) {
        this.associatedSince = associatedSince;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getPracticeLevel() {
        return practiceLevel;
    }

    public void setPracticeLevel(int practiceLevel) {
        this.practiceLevel = practiceLevel;
    }

    public String getSendEmail() {
        return sendEmail;
    }

    public void setSendEmail(String sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getCallFlag() {
        return callFlag;
    }

    public void setCallFlag(String callFlag) {
        this.callFlag = callFlag;
    }

    public String getSms() {
        return sms;
    }

    public void setSms(String sms) {
        this.sms = sms;
    }

    public String getPatrikaSubscribed() {
        return patrikaSubscribed;
    }

    public void setPatrikaSubscribed(String patrikaSubscribed) {
        this.patrikaSubscribed = patrikaSubscribed;
    }

    public String getUpdeshtaMemberID() {
        return updeshtaMemberID;
    }

    public void setUpdeshtaMemberID(String updeshtaMemberID) {
        this.updeshtaMemberID = updeshtaMemberID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isTrash() {
        return trash;
    }

    public void setTrash(boolean trash) {
        this.trash = trash;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreateSource() {
        return createSource;
    }

    public void setCreateSource(String createSource) {
        this.createSource = createSource;
    }

    public String getUpdateSource() {
        return updateSource;
    }

    public void setUpdateSource(String updateSource) {
        this.updateSource = updateSource;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
