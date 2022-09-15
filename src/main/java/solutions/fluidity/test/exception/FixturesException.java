package solutions.fluidity.test.exception;

public class FixturesException extends RuntimeException {
    private String message;

    public FixturesException(String message) {
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
