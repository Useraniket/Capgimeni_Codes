package looping;

import java.util.Scanner;

public class forloop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the starting number");
	int num1=sc.nextInt();
	System.out.println("enter the ending6 number");
	int num2=sc.nextInt();
	for (int i=num1;i<num2;i++)
	{
		System.out.println(i);
	}
	
}
}
