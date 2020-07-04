package vy.app.Exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

@Getter
public class APIException extends Exception {
    private HttpStatus status;
    private String message;
    private String path;

    public APIException(String message, String path, HttpStatus status) {
        this.message = message;
        this.path = path;
        this.status = status;
    }
}

// public APIException FirstNameNullException = new APIException("jgsd", "/member", HttpStatus.BAD_REQUEST)


