package vy.app.pojo;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class MemberDesignationIDDto implements Serializable {
    Long memberID;
    Long designationID;

    public MemberDesignationIDDto(Long memberID, Long designationID) {
        this.memberID = memberID;
        this.designationID = designationID;
    }

}
