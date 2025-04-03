package exception;

public class invalidPin extends RuntimeException {
    static String message = "Incorrect PIN";

    invalidPin() {
        super(message);
    }

    public invalidPin(String message) {
        super(message);
    }
}
