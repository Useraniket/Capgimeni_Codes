package conditionalStatement;

import java.util.Scanner;

public class newProg {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int num1=sc.nextInt();
	System.out.println("Enter second number");
	int num2=sc.nextInt();
	System.out.println("Enter the sign");
	char ch=sc.next().charAt(0);
    if(ch=='+')
    {
    	System.out.println(num1+num2);
    }
    else if(ch=='*')
    {
    	System.out.println(num1*num2);
    }
    else if(ch=='-')
    {
    	System.out.println(num1-num2);
    }
    else if(ch=='/')
    {
    	System.out.println(num1/num2);
    }
}
}
