package looping;

import java.util.Scanner;

public class summation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("the starting number");
	int start=sc.nextInt();
	System.out.println("the ending number");
	int end=sc.nextInt();
	int res=0;
	if(start>end)
	{
		System.out.println("invalid input");
	}
	else
	{
		
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			res+=i;
		}
		System.out.println(res);
	}
	
}
}
