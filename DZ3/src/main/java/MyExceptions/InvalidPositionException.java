package MyExceptions;

public class InvalidPositionException extends RuntimeException{
    public InvalidPositionException(){
        super("INVALID POSITION!!! (can't be empty or blank)");
    }
}
