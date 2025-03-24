package methods;

public class calculator {
public static double addition(double number1,double number2)
{
	return (number1 + number2);
}
public static int multiplication (double number1,double number2,double number3)
{
	return (int)(number1 * number2*number3);
}
public static void main(String[] args) {
	double a=addition(2,5);
	int b=multiplication(2,3,4);
	System.out.println(a);
	System.out.println(b);
}
}
