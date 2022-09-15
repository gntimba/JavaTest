package solutions.fluidity.test.exception;

public class BootStrapStaticException extends RuntimeException {
    private String message;

    public BootStrapStaticException(String message) {
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
