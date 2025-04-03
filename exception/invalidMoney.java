package exception;

public class invalidMoney extends RuntimeException {
    static String message = "Not Enough Money";

    invalidMoney() {
        super(message);
    }

    public invalidMoney(String message) {
        super(message);
    }
}
