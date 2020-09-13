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
@Table(name = "vy_designation")
public class Designation {
    @Column(name = "designation_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long designationID;

    @Column(name = "designation_name", unique = true, nullable = false)
    private String designationName;

    @Column(name = "status", nullable = false, columnDefinition = "boolean default true")
    private boolean status;

    @Column(name = "trash", nullable = false, columnDefinition = "boolean default false")
    private boolean trash;

    @Column(name = "created_at")
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    @UpdateTimestamp
    private Timestamp updatedAt;

    @OneToMany(mappedBy = "designation")
    @JsonIgnoreProperties(value = "designation")
    @ToString.Exclude()
    private Set<MemberDesignation> memberDesignations;
}