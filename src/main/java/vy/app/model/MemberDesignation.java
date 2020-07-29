package vy.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Entity
@Table(name = "vy_member_designation")
public class MemberDesignation {
    @EmbeddedId
    private MemberDesignationID memberDesignationID;

    @ManyToOne
    @MapsId("member_id")
    @JoinColumn(name = "member_id")
    @JsonIgnoreProperties(value = "memberDesignations")
    @ToString.Exclude()
    private Member member;

    @ManyToOne
    @MapsId("designation_id")
    @JoinColumn(name = "designation_id")
    @JsonIgnoreProperties(value = "memberDesignations")
    @ToString.Exclude()
    private Designation designation;

    @Column(name = "honour_date")
    private Date honourDate;

    @Column(name = "is_global")
    private boolean isGlobal;

    @Column(name = "dismiss_date")
    private Date dismissDate;

    @Column(name = "status")
    private boolean status;

    @Column(name = "trash")
    private boolean trash;

    @Column(name = "created_at")
//    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
//    @UpdateTimestamp
    private Timestamp updatedAt;
}
