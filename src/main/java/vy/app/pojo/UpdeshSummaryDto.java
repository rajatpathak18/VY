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
    private String updeshtaCity;
    private String updeshtaState;
    private String updeshtaCountry;
    private Long updeshCount;

    public UpdeshSummaryDto(Long updeshtaMemberID, String updeshtaFirstName, String updeshtaMiddleName, String updeshtaLastName, String updeshtaCity, String updeshtaState, String updeshtaCountry, Long updeshCount){
        this.updeshtaMemberID = updeshtaMemberID;
        this.updeshtaFirstName = updeshtaFirstName;
        this.updeshtaLastName = updeshtaLastName;
        this.updeshtaMiddleName = updeshtaMiddleName;
        this.updeshtaCity = updeshtaCity;
        this.updeshtaState = updeshtaState;
        this.updeshtaCountry = updeshtaCountry;
        this.updeshCount = updeshCount;
    }
}
