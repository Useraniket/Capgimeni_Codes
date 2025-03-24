package looping;

import java.util.Scanner;

public class reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int result=0;
	while(n>0)
	{
		int rem=n%10;
		result=result*10+rem;
		n=n/10;
	}
	System.out.println(result);
}
}
