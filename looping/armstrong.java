package looping;

import java.util.Scanner;
import java.lang.Math;
public class armstrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int temp=n;
	double ant=0;
	double res=0;
	while(n>0)
	{
		int rem=n%10;
		ant=Math.pow(rem, 3);
		res=res+ant;
		n=n/10;
	}
	if(temp==res)
	{
		System.out.println("Armstrong number");
	}
	else
	{
		System.out.println("Not an Armstrong number");
	}
	
}
}
