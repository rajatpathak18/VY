package vy.app.Exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

@Getter
public class APIExceptionBody {

    private HttpStatus status;
    private Timestamp timestamp;
    private String message;
    private String path;

    private APIExceptionBody() {
        timestamp = new Timestamp(System.currentTimeMillis());
    }

    public APIExceptionBody(String message, String path, HttpStatus status) {
        this();
        this.message = message;
        this.path = path;
        this.status = status;
    }
}
