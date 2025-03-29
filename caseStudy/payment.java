package caseStudy;

abstract class Payment {
	private double amount;
	private long transactionId;

	public Payment(long transactionId, double amount) {
		this.amount = amount;
		this.transactionId = transactionId;
	}

	abstract double processPayment();

	public double getAmount() {
		return amount;
	}

	public long getTransactionId() {
		return transactionId;
	}
}
