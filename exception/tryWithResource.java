package exception;

import java.util.InputMismatchException;
import java.util.Scanner;
//
//public class tryWithResource {
//public static void main(String[] args) {
//	try(Scanner sc=new Scanner(System.in))//here no need to close the scanner as it is a costly block
//	{
//		int n=sc.nextInt();
//		System.out.println(n);
//	}
//}
//}

//----------------------------ANOTHER EXAMPLE-----------------------------

public class tryWithResource {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n = 0;
		try
		{
			 n=sc.nextInt();
		}
		catch(InputMismatchException e)
		{
			e.printStackTrace();
		}
		finally//need to close in finally so that there is no data leak from scanner class
		{
			sc.close();
		}
		System.out.println(n);
	}
	}