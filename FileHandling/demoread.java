package FileHandling;

import java.io.FileReader;
import java.io.IOException;

public class demoread {
	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\User\\eclipse-workspace\\capg_code\\src\\FileHandling");
		int i = f.read();
		while (i != 0) {
			System.out.println((char) i);
			i = f.read();
		}
	}
}
