package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) {
        String path = "C:\\Users\\User\\Desktop\\JavaFHandle\\Santu\\cantu.txt";

        createFile(path);
        writeFile(path);
        appendFile(path);
        readFile(path);
        // deleteFile(path); // Uncomment to delete the file
    }

    // ✅ Create file
    public static void createFile(String path) {
        try {
            File file = new File(path);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred during file creation.");
            e.printStackTrace();
        }
    }

    // ✅ Write to file (overwrites)
    public static void writeFile(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("Line 1: Written fresh\n");
            bw.write("Line 2: Overwrites old content\n");
            System.out.println("Written to file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
            e.printStackTrace();
        }
    }

    // ✅ Append to file
    public static void appendFile(String path) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            bw.newLine();
            bw.write("Line 3: Appended this line.");
            bw.newLine();
            bw.write("Line 4: Appended again.");
            System.out.println("Appended to file.");
        } catch (IOException e) {
            System.out.println("Error appending to file.");
            e.printStackTrace();
        }
    }

    // ✅ Read from file
    public static void readFile(String path) {
        try (Scanner scanner = new Scanner(new File(path))) {
            System.out.println("\n📄 File Content:");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    // ✅ Delete file
    public static void deleteFile(String path) {
        File file = new File(path);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
