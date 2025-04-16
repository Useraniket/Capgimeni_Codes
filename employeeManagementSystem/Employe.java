package employeeManagementSystem;

public class Employe {
	private int id;
	private String name;
	private double salary;

	public Employe(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

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

	@Override
	public String toString() {
		return "[" + id + " " + name + " " + salary + "]";
	}
	@Override
	public boolean equals(Object obj) {
	    Employe employee = (Employe) obj;
	    return id == employee.id &&
	           Double.compare(employee.salary, salary) == 0 &&
	           name.equalsIgnoreCase(employee.name); 
	}

	@Override
	public int hashCode() {
	    int result = Integer.hashCode(id);
	    result = 31 * result + name.toLowerCase().hashCode();
	    result = 31 * result + Double.hashCode(salary);
	    return result;
	}
}
