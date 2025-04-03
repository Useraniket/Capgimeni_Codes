package exception;

import java.util.Scanner;

public class atm {

    public static void withdraw(double money, int newpin) {
        double newMoney = 0;

        if (money > 0) {
            newMoney += money;
        } else {
            throw new invalidMoney();
        }

        int correctPin = 1234;

        if (newpin == correctPin) {
            System.out.println("Correct Pin");
        } else {
            throw new invalidPin();
        }

        System.out.println("Withdrawal successful. Amount: " + newMoney);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount of money to withdraw:");
        double money = sc.nextDouble();
        System.out.println("Enter your PIN:");
        int newpin = sc.nextInt();

        try {
            withdraw(money, newpin);
        } catch (invalidMoney e) {
            System.out.println(e.getMessage());
        } catch (invalidPin e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
