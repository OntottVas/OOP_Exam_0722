package bank;

public class InvalidAccountNumberException extends Exception{
    public InvalidAccountNumberException() {
        super("Not a valid account number.");
    }
}
