package looping;

import java.util.Scanner;

public class mult {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("which multipication table");
	int n=sc.nextInt();
	for(int i=1;i<=10;i++)
	{
		int res=n*i;
		System.out.println(n+"*"+i+"="+res);
	}
	sc.close();
}
}
