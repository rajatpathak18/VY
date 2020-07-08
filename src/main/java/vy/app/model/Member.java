package vy.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
@ToString
@Entity
@Table(name = "vy_member")
public class Member {
    @Column(name = "member_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberID;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "dob")
    private Date dateOfBirth;

    @Column(name = "gender")
    private String gender;

    @Column(name = "mother_name")
    private String motherName;

    @Column(name = "father_name")
    private String fatherName;

    @Column(name = "phone_no")
    private String primaryPhoneNumber;

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

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_id")
    private Email email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "akshay_patra_id")
    private AkshayPatra akshayPatra;

    @ManyToMany(cascade = CascadeType.MERGE)
    @JoinTable(name = "vy_member_designation",
            joinColumns = {@JoinColumn(name = "member_id", referencedColumnName = "member_id")},
            inverseJoinColumns = {@JoinColumn(name = "designation_id", referencedColumnName = "designation_id")})
    private Set<Designation> designation;

    @Column(name = "associated_since")
    private Date associatedSince;

    @Column(name = "profession")
    private String profession;

    @Column(name = "practice_level")
    private int practiceLevel;

    @Column(name = "send_email")
    private boolean sendEmail;

    @Column(name = "call_flag")
    private boolean callFlag;

    @Column(name = "sms")
    private boolean sms;

    @Column(name = "patrika_subscribed")
    private boolean patrikaSubscribed;

    @Column(name = "has_swarved")
    private boolean hasSwarved;

    @Column(name = "updeshta_member_id")
    private String updeshtaMemberID;

    @Column(name = "updeshta_name")
    private String updeshtaName;

    @Column(name = "updesh_venue")
    private String updeshVenue;

    @Column(name = "status")
    private boolean status;

    @Column(name = "trash")
    private boolean trash;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "create_source")
    private String createSource;

    @Column(name = "update_source")
    private String updateSource;
}
