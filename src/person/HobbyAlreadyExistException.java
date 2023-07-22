package person;

public class HobbyAlreadyExistException extends Exception {
    public HobbyAlreadyExistException() {
        super("You already have this hobby.");
    }
}
