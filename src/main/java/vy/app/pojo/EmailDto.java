package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Date;

@Getter
@Setter
@ToString
public class EmailDto {
    private int emailID;
    private String emailAddress1;
    private String emailAddress2;
    private String status;
    private boolean trash;
    private Date createDate;
    private Date updateDate;
}
