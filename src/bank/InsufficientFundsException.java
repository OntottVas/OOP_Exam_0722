package bank;

public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message){
        super(message);
    }

    public InsufficientFundsException(){
        super("Insufficient funds, cannot withdraw.");
    }
}
