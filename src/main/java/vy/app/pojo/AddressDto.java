package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class AddressDto {
    private Long addressID;
    private String address;
    private String city;
    private String postalCode;
    private String country;
    private String state;
    private String landmark;
    private String alternateAddress;
    private String alternateCity;
    private String alternatePostalCode;
    private String alternateCountry;
    private String alternateState;
    private String alternateLandmark;
    private boolean status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
