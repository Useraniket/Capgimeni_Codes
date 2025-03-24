package conditionalStatement;
import java.util.Scanner;
public class ifElse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String st=sc.nextLine();
	int money=sc.nextInt();
	
	if(money>50)
	{
		System.out.println(st+"will get"+"chocolate");
	}
	sc.close();
}
}
