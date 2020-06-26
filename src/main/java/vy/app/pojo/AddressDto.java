package vy.app.pojo;

import vy.app.model.Member;

import java.sql.Date;

public class AddressDto {
    private int addressID;
    private Member member;
    private String address;
    private String city;
    private int postalCode;
    private String country;
    private String state;
    private String landmark;
    private String alternateAddress;
    private String alternateCity;
    private int alternatePostalCode;
    private String alternateCountry;
    private String alternateState;
    private String alternateLandmark;
    private String status;
    private boolean trash;
    private Date createDate;
    private Date updateDate;

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getAlternateAddress() {
        return alternateAddress;
    }

    public void setAlternateAddress(String alternateAddress) {
        this.alternateAddress = alternateAddress;
    }

    public String getAlternateCity() {
        return alternateCity;
    }

    public void setAlternateCity(String alternateCity) {
        this.alternateCity = alternateCity;
    }

    public int getAlternatePostalCode() {
        return alternatePostalCode;
    }

    public void setAlternatePostalCode(int alternatePostalCode) {
        this.alternatePostalCode = alternatePostalCode;
    }

    public String getAlternateCountry() {
        return alternateCountry;
    }

    public void setAlternateCountry(String alternateCountry) {
        this.alternateCountry = alternateCountry;
    }

    public String getAlternateState() {
        return alternateState;
    }

    public void setAlternateState(String alternateState) {
        this.alternateState = alternateState;
    }

    public String getAlternateLandmark() {
        return alternateLandmark;
    }

    public void setAlternateLandmark(String alternateLandmark) {
        this.alternateLandmark = alternateLandmark;
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

    @Override
    public String toString() {
        return "AddressDto{" +
                "addressID=" + addressID +
                ", member=" + member +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", landmark='" + landmark + '\'' +
                ", alternateAddress='" + alternateAddress + '\'' +
                ", alternateCity='" + alternateCity + '\'' +
                ", alternatePostalCode=" + alternatePostalCode +
                ", alternateCountry='" + alternateCountry + '\'' +
                ", alternateState='" + alternateState + '\'' +
                ", alternateLandmark='" + alternateLandmark + '\'' +
                ", status='" + status + '\'' +
                ", trash=" + trash +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                '}';
    }
}
