package playing_with_objects;

public class bankAcc {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public bankAcc deposit(double money) {
        if(money > 0) {  // Check if the deposited amount is positive
            balance += money;
        } else {
            System.out.println("Invalid amount");
        }
        return this;  // Return the same object
    }
}
