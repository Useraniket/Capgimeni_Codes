package OOPs;

import java.util.Scanner;

public class Atm {
	public static void main(String[] args) {
		account at=new account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome User");
		int choice=sc.nextInt();
		while(true)
		{
			double result;
			switch(choice)
			{
			case 1:
				System.out.println("The money you want to deposit");
				double n=sc.nextDouble();
			    result=at.deposit(n);
			    System.out.println("The updated money is"+result);
				break;
			case 2:
				System.out.println("The money you want to withdraw");
				double m=sc.nextDouble();
			    result=at.withdraw(m);
			    System.out.println("The updated money is"+result);
			    System.out.println(result);
				break;
			
			default:
				System.out.println("Invalid Input");
			}
		}
	}

}
