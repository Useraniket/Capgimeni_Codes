package inheritancePractice;

public class driver {
    public static void main(String[] args) {
        University uni = new University(3);

        Person s1 = new Student("Alice", 20, 101); // Upcasting
        Person p1 = new Professor("Dr. Bob", 45, "Computer Science"); // Upcasting
        Person s2 = new Student("Charlie", 22, 102); // Upcasting

        uni.addPerson(s1);
        uni.addPerson(p1);
        uni.addPerson(s2);
        
        uni.showPeople();
    }
}