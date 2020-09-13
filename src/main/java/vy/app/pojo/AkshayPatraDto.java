package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class AkshayPatraDto {
    private Long akshayPatraID;
    private String akshayPatraNum;
    private Date patraAllocationDate;
    private boolean status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}