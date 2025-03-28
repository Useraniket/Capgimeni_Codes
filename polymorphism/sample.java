// Base class
package polymorphism;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Derived class: Student
class Student extends Person {
    private int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
    }
}

// Derived class: Professor
class Professor extends Person {
    private String specialization;

    public Professor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
    }
}

// University class handling different Person objects
class University {
    private Person[] people;
    private int count;

    public University(int size) {
        this.people = new Person[size];
        this.count = 0;
    }

    public void addPerson(Person p) {
        if (count < people.length) {
            people[count] = p; // Upcasting: Student/Professor -> Person
            count++;
        } else {
            System.out.println("University is full!");
        }
    }

    public void showPeople() {
        for (int i = 0; i < count; i++) {
            people[i].displayInfo();
            
            // Downcasting example
            if (people[i] instanceof Student) {
                Student s = (Student) people[i]; // Downcasting: Person -> Student
                System.out.println("(Downcasted) Student ID: " + s.getStudentId());
            } else if (people[i] instanceof Professor) {
                Professor p = (Professor) people[i]; // Downcasting: Person -> Professor
                System.out.println("(Downcasted) Specialization: " + p.getSpecialization());
            }
            System.out.println();
        }
    }
}

// Driver class
public class UniversityDemo {
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