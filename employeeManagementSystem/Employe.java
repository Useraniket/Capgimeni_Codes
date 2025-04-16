package employeeManagementSystem;

import java.util.Objects;

public class Employe implements Comparable<Employe> {
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize employee object
    public Employe(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and setters for private fields
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Custom toString method to display employee details
    @Override
    public String toString() {
        return String.format("Employee [ID: %d, Name: %s, Salary: %.2f]", id, name, salary);
    }

    // Custom equals method to compare two employees
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employe)) return false;
        Employe other = (Employe) obj;
        return this.id == other.id &&
               Double.compare(this.salary, other.salary) == 0 &&
               this.name.equalsIgnoreCase(other.name);
    }

    // Custom hashCode method to maintain consistency with equals
    @Override
    public int hashCode() {
        return Objects.hash(id, name.toLowerCase(), salary);
    }

    // Implementing Comparable to allow sorting by ID
    @Override
    public int compareTo(Employe other) {
        return Integer.compare(this.id, other.id); // Default sort by ID
    }
}
