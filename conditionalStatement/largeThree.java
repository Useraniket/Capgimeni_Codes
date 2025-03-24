package conditionalStatement;

import java.util.Scanner;

public class largeThree {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	System.out.println("Enter second number");
	int num2=sc.nextInt();
	System.out.println("Enter third number");
	int num3=sc.nextInt();
	if(num1>num2&&num1>num3)
	{
		System.out.println("the number1 is largest");
	}
	else if(num2>num1&&num2>num3)
	{
		System.out.println("the number2 is largest");
	}
	else if(num3>num1&&num3>num2)
	{
		System.out.println("the number3 is largest");
	}
	sc.close();
}
}
