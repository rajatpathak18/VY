package vy.app.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UpdeshSummaryDto {
    private Long updeshtaMemberID;
    private String updeshtaFirstName;
    private String updeshtaMiddleName;
    private String updeshtaLastName;
    private Long updeshCount;

    public UpdeshSummaryDto(Long updeshtaMemberID, String updeshtaFirstName, String updeshtaMiddleName, String updeshtaLastName, Long updeshCount){
        this.updeshtaMemberID = updeshtaMemberID;
        this.updeshtaFirstName = updeshtaFirstName;
        this.updeshtaLastName = updeshtaLastName;
        this.updeshtaMiddleName = updeshtaMiddleName;
        this.updeshCount = updeshCount;
    }
}
