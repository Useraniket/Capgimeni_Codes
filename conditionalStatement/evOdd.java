package conditionalStatement;

import java.util.Scanner;

public class evOdd {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println("Even number");
	}
	else
	{
		System.out.println("Odd number");
	}
	sc.close();
}
}
