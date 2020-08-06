package vy.app.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

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
    private Long memberID;

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


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "member_photo_id")
    private MemberPhoto memberPhoto;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "email_id")
    private Email email;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "akshay_patra_id")
    private AkshayPatra akshayPatra;

    @OneToMany(mappedBy = "member")
    @JsonIgnoreProperties(value = "member")
    @ToString.Exclude()
    private Set<MemberDesignation> memberDesignations;

    @Column(name = "associated_since")
    private Date associatedSince;

    @Column(name = "profession")
    private String profession;

    @Column(name = "practice_level")
    private int practiceLevel;

    @Column(name = "send_email", nullable = false, columnDefinition = "boolean default false")
    private boolean sendEmail;

    @Column(name = "call_flag", nullable = false, columnDefinition = "boolean default false")
    private boolean callFlag;

    @Column(name = "sms", nullable = false, columnDefinition = "boolean default false")
    private boolean sms;

    @Column(name = "patrika_subscribed", nullable = false, columnDefinition = "boolean default false")
    private boolean patrikaSubscribed;

    @Column(name = "has_swarved", nullable = false, columnDefinition = "boolean default false")
    private boolean hasSwarved;

    @Column(name = "updeshta_member_id")
    private Long updeshtaMemberID;

    @Column(name = "updeshta_name")
    private String updeshtaName;

    @Column(name = "updesh_venue")
    private String updeshVenue;

    @Column(name = "create_source")
    private String createSource;

    @Column(name = "update_source")
    private String updateSource;

    @Column(name = "status", nullable = false, columnDefinition = "boolean default true")
    private boolean status;

    @Column(name = "trash", nullable = false, columnDefinition = "boolean default false")
    private boolean trash;

    @CreationTimestamp
    @Column(name = "created_at")
    private Timestamp createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
