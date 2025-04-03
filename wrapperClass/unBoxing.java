package wrapperClass;

public class unBoxing {
public static void main(String[] args) {
	Integer i1=new Integer(167);
	int i2=i1.intValue();
	byte b=i1.byteValue();
	System.out.println(b);
	
	//------another way(cannot directly integer object to byte)-------
	int i4=i1;
	System.out.println(i4);
}
}
