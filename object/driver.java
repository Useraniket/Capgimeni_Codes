package object;

public class driver {
	public static void main(String[] args) {
		// Creating Student objects
		student student1 = new student(1, "Alice", 89.5);
		student student2 = new student(2, "Bob", 91.2);
		student student3 = new student(1, "Alice", 89.5);

		System.out.println(student1);
		System.out.println(student2);

		System.out.println("student1 equals student2: " + student1.equals(student2));
		System.out.println("student1 equals student3: " + student1.equals(student3));

		System.out.println("Hash code of student1: " + student1.hashCode());
		System.out.println("Hash code of student2: " + student2.hashCode());
		System.out.println("Hash code of student3: " + student3.hashCode());
	}
}
