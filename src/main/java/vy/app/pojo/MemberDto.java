package vy.app.pojo;

import java.sql.Date;


public class MemberDto {

    private int memberID;
    private String firstName;
    private String lastName;
    private Date dob;
    private String gender;
    private String phoneNumber;
    private String alternatePhoneNumber;
    private String govtID;
    private String govtIDType;
    private String nationality;
    private String memberPhotoPath;
    private String govtIDPhotoPath;
    private Date associatedSince;
    private String profession;
    private int practiceLevel;
    private String sendEmail;
    private String callFlag;
    private String sms;
    private String patrikaSubscribed;
    private String updeshtaMemberID;
    private String status;
    private boolean trash;
    private Date createDate;
    private Date updateDate;
    private String createSource;
    private String updateSource;

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
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

    @Override
    public String toString() {
        return "Member{" +
                "memberID=" + memberID +
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
}
