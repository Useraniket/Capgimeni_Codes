package employeeManagementSystem;

import java.util.Objects;

public class Employe {
	private int id;
	private String name;
	private double salary;

	public Employe(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	// Getters and setters
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

	// toString override
	@Override
	public String toString() {
		return String.format("Employee [ID: %d, Name: %s, Salary: %.2f]", id, name, salary);
	}

	// equals override
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (!(obj instanceof Employe)) return false;
		Employe other = (Employe) obj;
		return this.id == other.id &&
			   Double.compare(this.salary, other.salary) == 0 &&
			   this.name.equalsIgnoreCase(other.name);
	}

	// hashCode override
	@Override
	public int hashCode() {
		return Objects.hash(id, name.toLowerCase(), salary);
	}
}
