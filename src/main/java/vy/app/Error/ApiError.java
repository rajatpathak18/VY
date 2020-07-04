package vy.app.Error;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ApiError {
    private HttpStatus status;
    //    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
//    private LocalDateTime timestamp;
    private String message;
    private String path;

//    private ApiError() {
//        timestamp = LocalDateTime.now();
//    }

    public ApiError(HttpStatus status, String path, String message) {
//        this();
        this.status = status;
        this.message = message;
        this.path = path;
    }
}