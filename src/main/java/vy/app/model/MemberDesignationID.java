package vy.app.model;

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
@Embeddable
@NoArgsConstructor
public class MemberDesignationID implements Serializable {
    @Column(name = "member_id")
    Long memberID;

    @Column(name = "designation_id")
    Long designationID;

    public MemberDesignationID(Long memberID, Long designationID) {
        this.memberID = memberID;
        this.designationID = designationID;
    }

}
