package object;

import java.util.Objects;

public class student
{
    private int id;
    private String name;
    private double percentage;

    // Constructor
    public student(int id, String name, double percentage) {
        this.id = id;
        this.name = name;
        this.percentage = percentage;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPercentage() {
        return percentage;
    }

    // toString method
    @Override
    public String toString() {
        return "ID: " + this.getId() + " Name: " + this.getName() + " Percentage: " + this.getPercentage();
    }

    // equals method
    @Override
    public boolean equals(Object obj) {
           student s = (student) obj;
            return this.name.equals(s.name) && this.id == s.id && this.percentage == s.percentage;
       
    }

    // hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(this.getName(), this.getId(), this.getPercentage());
    }
}
