package caseStudy;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the discount percentage: ");
		double discount = scanner.nextDouble();

		payment creditCardPayment = new creditCardPayment(12345, 900.0, discount);
		creditCardPayment.processPayment();

		payment paypalPayment = new paypalPayment(65743, 300.0, discount);
		paypalPayment.processPayment();

		scanner.close();
	}
}
