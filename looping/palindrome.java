package looping;

import java.util.Scanner;
public class palindrome
{
public static boolean checkPalindrome(int n)
{
	
	int temp=n;
	int sum=0;
	boolean b;
	while(n!=0)
	{
		int rem=n%10;
		sum+=rem;
		n=n/10;
	}
	if(temp==sum)
	{
		b=true;
	}
	else
	{
		b=false;
	}
	return b;
}

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	System.out.println(checkPalindrome(n));
}
}
