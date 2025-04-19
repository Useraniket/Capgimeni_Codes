package customObject;

import java.util.HashMap;
import java.util.Map;

public class driver {
    public static void main(String[] args) {
        HashMap<Student, String> studentCourses = new HashMap<>();

        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(102, "Bob");
        Student s3 = new Student(103, "Charlie");

        studentCourses.put(s1, "Mathematics");
        studentCourses.put(s2, "Physics");
        studentCourses.put(s3, "Computer Science");

        // Display all entries
        for (Map.Entry<Student, String> entry : studentCourses.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Retrieve value using a new object with same data
        Student lookup = new Student(101, "Alice");
        System.out.println("\nLookup course for: " + lookup);
        System.out.println("Course: " + studentCourses.get(lookup)); // Should find the entry
    }
}
