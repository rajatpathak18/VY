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

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
