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
@Table(name = "vy_akshay_patra")
public class AkshayPatra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "akshay_patra_id")
    private Long akshayPatraID;

    @Column(name = "akshay_patra_num")
    private String akshayPatraNum;

    @Column(name = "patra_allocation_date")
    private Date patraAllocationDate;

    @Column(name = "status")
    private boolean status;

    @Column(name = "created_at")
    @CreationTimestamp
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

    @Column(name = "trash")
    private boolean trash;
}
