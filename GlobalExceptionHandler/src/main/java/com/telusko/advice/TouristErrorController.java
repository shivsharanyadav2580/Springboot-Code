package com.telusko.advice;

import com.telusko.exception.TouristNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class TouristErrorController {

    @ExceptionHandler(TouristNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleTouristNotFoundException(TouristNotFoundException ex) {
       ErrorDetails details = new ErrorDetails();
       details.setMessage(ex.getMessage());
       details.setTimestamp(LocalDateTime.now());
       details.setStatusCode(404);


        return new ResponseEntity<>(details , HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> handleTouristNotFoundException(Exception ex) {
        ErrorDetails details = new ErrorDetails();
        details.setMessage(ex.getMessage());
        details.setTimestamp(LocalDateTime.now());
        details.setStatusCode(404);


        return new ResponseEntity<>(details , HttpStatus.BAD_REQUEST);
    }
}
