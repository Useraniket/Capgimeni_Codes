package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class demo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("C:\\Users\\User\\eclipse-workspace\\capg_code\\src\\FileHandling");
        writer.write("Hello, World!\nThis is Java FileWriter.");
        writer.close();
        System.out.println("Written successfully.");
    }
}
