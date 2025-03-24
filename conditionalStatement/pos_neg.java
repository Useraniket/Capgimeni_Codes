package conditionalStatement;

import java.util.Scanner;

public class pos_neg {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if(num>0)
	{
		System.out.println("it is a positive number");
	}
	else
	{
		System.out.println("it is a negative number");
	}
	sc.close();
}
}
