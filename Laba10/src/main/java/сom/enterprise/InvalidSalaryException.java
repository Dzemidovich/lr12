package сom.enterprise;
public class InvalidSalaryException extends IllegalArgumentException {
    public InvalidSalaryException(String message) {
        super(message);
    }
}