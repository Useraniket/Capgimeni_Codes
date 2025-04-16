package employeeManagementSystem;

import java.util.*;

public class Employees {
    // Static list to store all employees
    static ArrayList<Employe> list = new ArrayList<>();

    // Adds an employee to the list
    public static void addEmployee(Employe emp) {
        list.add(emp);
        System.out.println("Employee added successfully.");
        System.out.println("-----------------------------------");
    }

    // Prints all employees in the list
    public static void print() {
        for (Employe emp : list) {
            System.out.println(emp);
        }
    }

    // Searches for an employee by full object (id, name, salary)
    public static void searchEmployee(Employe emp) {
        if (list.contains(emp)) {
            int index = list.indexOf(emp);
            System.out.println("Employee found at index " + index + ":");
            System.out.println(list.get(index));
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Searches for an employee by ID
    public static void searchById(int empId) {
        for (Employe emp : list) {
            if (emp.getId() == empId) {
                System.out.println("Employee found: " + emp);
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Deletes an employee by full object
    public static void deleteEmployee(Employe emp) {
        if (list.remove(emp)) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Deletes an employee by ID using a for-each loop
    public static void deleteById(int empId) {
        Employe toRemove = null;
        for (Employe emp : list) {
            if (emp.getId() == empId) {
                toRemove = emp;
                break;
            }
        }
        if (toRemove != null && list.remove(toRemove)) {
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    // Updates employee's name and salary by ID
    public static void updateById(int empId, Scanner sc) {
        for (Employe emp : list) {
            if (emp.getId() == empId) {
                System.out.println("Enter new name:");
                emp.setName(sc.nextLine());

                System.out.println("Enter new salary:");
                emp.setSalary(sc.nextDouble());
                sc.nextLine();

                System.out.println("Employee updated successfully.");
                return;
            }
        }
        System.out.println("Employee with ID " + empId + " not found.");
    }

    // Sorts the list by employee ID using Comparable
    public static void sortById() {
        Collections.sort(list);
        System.out.println("Sorted by ID successfully.");
    }
}
