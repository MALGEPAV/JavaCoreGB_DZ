package MyExceptions;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(){
        super("INVALID AGE!!! (can't be lower than 18 or higher than 100)");
    }
}
