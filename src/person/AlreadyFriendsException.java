package person;

public class AlreadyFriendsException extends Exception{
    public AlreadyFriendsException(){
        super("You have already befriended this person.");
    }
}
