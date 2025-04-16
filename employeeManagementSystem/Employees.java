package employeeManagementSystem;

import java.util.*;

public class Employees {
    static ArrayList<Employe> list = new ArrayList<>();

    public static void addEmployee(Employe emp) {
        list.add(emp);
        System.out.println("Employee added successfully.");
        System.out.println("-----------------------------------");
    }

    public static void print() {
        Iterator<Employe> itr = list.iterator();
        while (itr.hasNext()) {
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
                System.out.println("Employee found: " + emp);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    public static void deleteEmployee(Employe emp) {
        if (list.remove(emp)) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public static void deleteById(int empId) {
		Employe e=null;
    	for (Employe emp : list) {
			if (emp.getId() == empId) {
			e=emp;				
			}
			list.remove(e);
		}
    }

    public static void updateById(int empId, Scanner sc) {
        for (Employe emp : list) {
            if (emp.getId() == empId) {
                System.out.println("Enter new name:");
                emp.setName( sc.nextLine());
         
                System.out.println("Enter new salary:");
            
                emp.setSalary(sc.nextDouble());
                System.out.println("Employee updated successfully.");
            }
        }
    }
//
//    public static void sortById() {
//        Collections.sort(list, Comparator.comparingInt(Employe::getId));
//        System.out.println("Sorted by ID successfully.");
//    }
}
