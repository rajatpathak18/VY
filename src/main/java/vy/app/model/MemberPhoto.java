package vy.app.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString
@Entity
@Table(name = "vy_member_photo")
public class MemberPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_photo_id")
    private Long memberPhotoID;

    @Column(name = "type")
    private String type;

    @Column(name = "photo_byte")
    private String fileAsBase64;
}
