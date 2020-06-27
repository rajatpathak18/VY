package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class AddressDto {
    private int addressID;
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
}
