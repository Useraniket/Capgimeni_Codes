package caseStudy;

public class creditCardPayment extends Payment {

	private double transaction_fee_percent = 2.0;
	private double discount;

	public creditCardPayment(long transactionId, double amount, double discount) {
		super(transactionId, amount);
		this.discount = discount;
	}

	@Override
	double processPayment() {

		double appliedDiscount = (getAmount() > 500) ? (getAmount() * discount / 100) : 0;

		double transactionFee = ((getAmount() - appliedDiscount) * transaction_fee_percent / 100);
		double finalPayable = getAmount() - appliedDiscount + transactionFee;

		System.out.println("Processing Credit Card Payment.....");
		System.out.println("Transaction ID: " + getTransactionId());
		System.out.println("Original Amount: " + getAmount());
		System.out.println("Discount Applied: " + appliedDiscount);
		System.out.println("Transaction Fee: " + transactionFee);
		System.out.println("Final Payable Amount: " + finalPayable);
		System.out.println("Credit Card Payment Successful!");

		return finalPayable;
	}
}
