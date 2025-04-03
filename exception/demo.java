package exception;

public class demo {
public static int done()
{
	try
	{
		return 1;
	}
	catch(Exception e)
	{
		return 2;
	}
	finally
	{
		return 3;
	}
	
	}
public static void main(String[] args) {
	System.out.println(done());//even though there is a catch block the finally will only return
}
}
