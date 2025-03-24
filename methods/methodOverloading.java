package methods;

public class methodOverloading {

	public static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	public static void sub(int a,int b,int c)
	{
		System.out.println(a-b-c);
	}
	public static void mul(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void mul(int a,char ch)
	{
		System.out.println(a*ch);
	}
	
	public static void main(String[] args) {
	sub(10,5);
	sub(10,5,1);
	mul(10,5);
	mul(10,'a');
}
}
