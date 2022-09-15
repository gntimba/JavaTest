package solutions.fluidity.test.exception;

public class EventPointsException extends RuntimeException {
    private String message;

    public EventPointsException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
