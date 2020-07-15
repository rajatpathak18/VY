package vy.app.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "vy_member_designation")
public class MemberDesignation {
    @Column(name = "member_designation_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberDesignationID;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "designation_id")
    @JsonIgnoreProperties(value = "memberDesignations")
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
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
