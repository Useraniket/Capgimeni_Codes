package employeeManagementSystem;

import java.util.ArrayList;
import java.util.Iterator;

public class Employees {
	static ArrayList<Employe> list = new ArrayList<>();

	public static void addEmployee(Employe emp) {
		list.add(emp);
		System.out.println("Employee added successfully.");
		System.out.println("-----------------------------------");
	}

	public static void print() {
//		if (list.isEmpty()) {
//			System.out.println("No employees to display.");
//		} else {
//			for (Employe emp : list) {
//				System.out.println(emp);
//			}
		// using iterator
//		Iterator<Employe> itr = list.iterator();
//		while (!itr.hasNext()) {
//			Employe emp = itr.next();
//			System.out.println(emp);
//		}
		Iterator<Employe> itr = list.iterator();
    	while(itr.hasNext()) {
    		Employe emp = itr.next();
    		System.out.println(emp);
    	}
    	
	}

	public static void searchEmployee(Employe emp) {
		 if (list.contains(emp)) {
             int index = list.indexOf(emp);
             System.out.println("Employee found at index " + index + ":");
             System.out.println(list.get(index));
         } else {
             System.out.println("Employee not found.");
         }	
	}

	public static void searchById(int empId) {
		for (Employe emp : list) {
			if (emp.getId() == empId) {
				System.out.println(emp);
				return;
			}
		}
		System.out.println("Employee not found.");
	}
}
