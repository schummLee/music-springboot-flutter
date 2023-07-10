package do_api.ExceptionHandle;

public class IdAlreadyTakenException extends RuntimeException {
    public IdAlreadyTakenException(String message) {
        super(message);
    }
}
