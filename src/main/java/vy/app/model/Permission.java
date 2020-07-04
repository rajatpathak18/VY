package vy.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Getter
@Setter
@ToString
@Entity
@Table(name = "vy_permission")
public class Permission {
    @Column(name = "permission_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int permissionID;

    @Column(name = "permission_name")
    private String name;

    @Column(name = "status")
    private boolean status;

    @Column(name = "trash")
    private boolean trash;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "update_date")
    private Date updateDate;
}
