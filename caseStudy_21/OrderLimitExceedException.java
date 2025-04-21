package caseStudy_21;

public class OrderLimitExceedException extends Exception {
    public OrderLimitExceedException(String message) {
        super(message);
    }
}
