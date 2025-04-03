package wrapperClass;

public class unparsing {
	public static void main(String[] args) {
		
		//-------1rst way--------
		int a=10;
		String st=String.valueOf(a);
		System.out.println(st);
		
		//-------2nd way---------
		int a2=10;
		String st3=Integer.toString(a2);
		System.out.println(st3);
		
		//-----same for double--------
		double d=10.68;
		String st2=String.valueOf(d);
		System.out.println(st2);
	}
}
