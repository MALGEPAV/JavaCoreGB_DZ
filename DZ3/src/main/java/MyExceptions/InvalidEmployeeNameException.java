package MyExceptions;

public class InvalidEmployeeNameException extends RuntimeException{
    public InvalidEmployeeNameException(){
        super("INVALID NAME!!! (can't be empty or blank)");
    }
}
