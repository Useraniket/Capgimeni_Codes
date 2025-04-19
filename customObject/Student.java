package customObject;
import java.util.Objects;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals() for correct key comparison
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return id == s.id && name.equals(s.name);
    }

    // Override hashCode() for key hashing
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // For printing
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "'}";
    }
}
