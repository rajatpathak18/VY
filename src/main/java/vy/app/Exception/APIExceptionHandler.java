package vy.app.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;

public class APIExceptionHandler {
    public APIExceptionHandler(APIException apiException) {
        new ResponseEntity<Object>(apiException, new HttpHeaders(), apiException.getStatus());
    }
}
