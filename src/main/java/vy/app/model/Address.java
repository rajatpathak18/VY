package vy.app.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "vy_address")
public class Address {
    @Column(name = "address_id")
    @Id
    @GeneratedValue
    private int addressID;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "postal_code")
    private int postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "state")
    private String state;

    @Column(name = "landmark", nullable = true)
    private String landmark;

    @Column(name = "alternate_address", nullable = true)
    private String alternateAddress;

    @Column(name = "alternate_city", nullable = true)
    private String alternateCity;

    @Column(name = "alternate_postal_code")
    private int alternatePostalCode;

    @Column(name = "alternate_country", nullable = true)
    private String alternateCountry;

    @Column(name = "alternate_state", nullable = true)
    private String alternateState;

    @Column(name = "alternate_landmark", nullable = true)
    private String alternateLandmark;

    @Column(name = "status")
    private String status;

    @Column(name = "trash")
    private boolean trash;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date", nullable = true)
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
        return "Address{" +
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
