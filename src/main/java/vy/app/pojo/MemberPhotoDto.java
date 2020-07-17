package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@ToString
public class MemberPhotoDto {
    private Long memberPhotoID;
    private String type;
    private String fileAsBase64;
}
