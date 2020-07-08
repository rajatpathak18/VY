package vy.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Entity
@Table(name = "vy_address")
public class Address {
    @Column(name = "address_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressID;

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

    @Column(name = "landmark")
    private String landmark;

    @Column(name = "alternate_address")
    private String alternateAddress;

    @Column(name = "alternate_city")
    private String alternateCity;

    @Column(name = "alternate_postal_code")
    private int alternatePostalCode;

    @Column(name = "alternate_country")
    private String alternateCountry;

    @Column(name = "alternate_state")
    private String alternateState;

    @Column(name = "alternate_landmark")
    private String alternateLandmark;

    @Column(name = "status")
    private boolean status;

    @Column(name = "trash")
    private boolean trash;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
