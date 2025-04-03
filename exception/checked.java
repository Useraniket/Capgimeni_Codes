package exception;

public class checked {
public static void printNumber()throws InterruptedException
{
	for(int i=1;i<=10;i++)
	{
		System.out.println(i);
		Thread.sleep(1000);
	}
}
public static void demo() throws InterruptedException,NullPointerException
{
	printNumber();
}
public static void main(String[] args) {
	try {
		demo();
	} catch (Exception e) {
		
		e.printStackTrace();
	}
}
}
