package SetCaseStudy;
import java.util.*;

public class driver {
	public static void main(String[] args) {
		Set<Student> studentSet = new HashSet<>();

		Student s1 = new Student(1, "Aniket Paul", 88.5);
		Student s2 = new Student(2, "Riya Sen", 91.2);
		Student s3 = new Student(1, "Aniket Paul", 88.5); // duplicate

		studentSet.add(s1);
		studentSet.add(s2);
		studentSet.add(s3); // will not be added because it's duplicate of s1

		for (Student s : studentSet) {
			System.out.println(s);
		}
	}
}
