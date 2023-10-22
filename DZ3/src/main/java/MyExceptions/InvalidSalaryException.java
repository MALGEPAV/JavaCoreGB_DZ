package MyExceptions;

public class InvalidSalaryException extends RuntimeException{
    public InvalidSalaryException(){
        super("INVALID SALARY!!! (can't be negative)");
    }
}
