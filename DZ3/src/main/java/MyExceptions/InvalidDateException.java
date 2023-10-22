package MyExceptions;

public class InvalidDateException extends RuntimeException{
    public InvalidDateException(){
        super("INVALID DATE!!!");
    }
}
