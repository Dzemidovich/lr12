package сom.enterprise;


public class InvalidBonusException extends IllegalArgumentException {
    public InvalidBonusException(String message) {
        super(message);
    }
}