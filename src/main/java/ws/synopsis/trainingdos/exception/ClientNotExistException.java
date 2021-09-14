package ws.synopsis.trainingdos.exception;

public class ClientNotExistException extends Exception {
    public ClientNotExistException() {
    }

    public ClientNotExistException(String message) {
        super(message);
    }

    public ClientNotExistException(String message, Throwable cause) {
        super(message, cause);
    }

    public ClientNotExistException(Throwable cause) {
        super(cause);
    }
}
