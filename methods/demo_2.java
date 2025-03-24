package methods;

import java.util.Scanner;

public class demo_2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num:");
	int a=sc.nextInt();
	sc.nextLine();
	System.out.println("enter the sen:");
	String st=sc.nextLine();
	System.out.println(st+a);
    }
}
