package vy.app.pojo;

import lombok.*;

import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class ReportDto {
    private String status, description, path;
}
