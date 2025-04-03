package wrapperClass;

public class explore {
	public static void main(String[] args) {
		Double i1=new Double(167.78);
		int i2=i1.intValue();
		byte b=i1.byteValue();
		short s=i1.shortValue();
		long l=i1.longValue();
		float f=i1.floatValue();


		
		System.out.println("integer:"+i1);
		System.out.println("Byte:"+b);
		System.out.println("Short:"+s);
		System.out.println("Long:"+l);
		System.out.println("float:"+f);
				
		
		//------another way(cannot directly integer object to byte)-------
		Double i4=i1;
		System.out.println("Directly using double:"+i4);
	
		
	}
}
