package wrapperClass;

public class boxing {
	public static void main(String[] args) {
		int i = 10;
		// ----one way to do boxing(pass it to the constructor)----
		Integer i2 = new Integer(i);
		System.out.println(i + "\t" + i2);
		// ------2nd way------
		Integer i3 = Integer.valueOf(i);

		// -----auto boxing------
		Integer i4 = i;
	}
}
