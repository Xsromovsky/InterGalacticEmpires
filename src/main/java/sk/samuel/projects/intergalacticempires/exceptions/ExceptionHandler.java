package sk.samuel.projects.intergalacticempires.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.ZoneId;
import java.time.ZonedDateTime;


@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(value = {ResourceNotFoundException.class})
    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundException e){
        Exception exception = new Exception(e.getMessage(), HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")));
        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
    }
}
