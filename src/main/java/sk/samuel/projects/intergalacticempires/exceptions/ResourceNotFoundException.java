package sk.samuel.projects.intergalacticempires.exceptions;


import lombok.Getter;

@Getter
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String message){
        super(message);
    }
    public ResourceNotFoundException(String message, Throwable throwable){
        super(message, throwable);
    }
}
