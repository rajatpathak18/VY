package vy.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
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
    private int designationID;

    @Column(name = "designation_name")
    private String designationName;

    @Column(name = "status")
    private boolean status;

    @Column(name = "trash")
    private boolean trash;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;

//    @ManyToMany(mappedBy = "designation", cascade = CascadeType.PERSIST)
//    private Set<Member> members;
}