package MyExceptions;

public class InvalidRaiseException extends RuntimeException{
    public InvalidRaiseException(){
        super("INVALID RAISE!!! (can't be negative)");
    }
}
