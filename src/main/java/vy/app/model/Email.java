package vy.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Entity
@Table(name = "vy_email")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private Long emailID;

    @Column(name = "email_address_1")
    private String emailAddress1;

    @Column(name = "email_address_2")
    private String emailAddress2;

    @Column(name = "status")
    private boolean status;

    @Column(name = "trash")
    private boolean trash;

    @Column(name = "created_at")
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
