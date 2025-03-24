package conditionalStatement;

import java.util.Scanner;

public class switchCase {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	char day=sc.next().charAt(0);
	switch(day)
	{
	case '0':
	{
		System.out.println("Sunday");
		break;
	}
	case '1':
	{
		System.out.println("Monday");
		break;
	}
	case '2':
	{
		System.out.println("Tuesday");
		break;
	}
	case '3':
	{
		System.out.println("Wednesday");
		break;
	}
	case '4':
	{
		System.out.println("Thursday");
		break;
	}
	case '5':
	{
		System.out.println("Friday");
		break;
	}
	case '6':
	{
		System.out.println("Saturday");
		break;
	}
	default:
	{
		System.out.println("Invalid Input");
	}
	
	}
}
}
