package Network;

public class ResponseException extends Exception {
    public ResponseException() {
        super();
    }

    public ResponseException(String message) {
        super(message);
    }

    public ResponseException(Throwable throwable) {
        super(throwable);
    }

    public ResponseException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
