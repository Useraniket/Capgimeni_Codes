package reflection;

public class Person {
    private String name = "Aniket";
    private int age;

    // ✅ Public no-arg constructor (required for getConstructor())
    public Person() {
        // Optional: Default values
        this.name = "Default";
        this.age = 0;
    }

    // ✅ Constructor used in driver2: getDeclaredConstructor(String, int)
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    public String getDetails() {
        return name + ", " + age;
    }
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

}
