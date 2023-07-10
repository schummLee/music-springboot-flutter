package do_api.Exception;

public class IdAlreadyTakenException extends RuntimeException {
    public IdAlreadyTakenException(String message) {
        super(message);
    }
}
