package OOPs;

public class EmployeeNeed {
	 public static void main(String[] args) {
			Employee emp=new Employee();
			
			System.out.println(emp.getName());
			System.out.println(emp.getage());
			System.out.println(emp.getphone());
			System.out.println(emp.getsalary());
			emp.setname("ABC");
			System.out.println(emp.getName());
		}

}
