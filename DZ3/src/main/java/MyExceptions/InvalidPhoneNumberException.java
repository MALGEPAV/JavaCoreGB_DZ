package MyExceptions;

public class InvalidPhoneNumberException extends RuntimeException{
    public InvalidPhoneNumberException(){
        super("INVALID PHONE NUMBER!!! (can't be empty or blank)");
    }
}
