package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;
import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class EmailDto {
    private Long emailID;
    private String emailAddress1;
    private String emailAddress2;
    private boolean status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
