package methods;

public class sam1 {
	public static void charChange(char ch) {
		
		int i=ch;
		System.out.println(ch+"="+i);
	}

	public static void fullName(String first, String last) {
		System.out.println(first + " " + last);
	}
	
	public static void main(String[] args) {
	charChange('c');
	fullName("Aniket","Paul");
}
}
