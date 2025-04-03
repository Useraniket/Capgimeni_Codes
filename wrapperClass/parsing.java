package wrapperClass;

public class parsing {
	public static void main(String[] args) {
		//string data to integer data
		
		String s = "123";
		int n=Integer.parseInt(s);
		System.out.println(n);
		
		//*********int i2=Integer.parseInt("hi");//we will get "NumberFormatException"**********
		
		
		//string data to double
		double d=Double.parseDouble(s);
		System.out.println(d);
	}
}
