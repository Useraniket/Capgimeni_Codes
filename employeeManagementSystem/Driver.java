package employeeManagementSystem;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------WELCOME-----------------------------------");

        while (true) {
            // Display menu
            System.out.println("1. Add Employee");
            System.out.println("2. Print All Employee");
            System.out.println("3. Search Employee");
            System.out.println("4. Search Employee as ID");
            System.out.println("5. Delete Employee");
            System.out.println("6. Delete Employee By ID");
            System.out.println("7. Update Employee By ID");
            System.out.println("8. Sort Employee Based On ID");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    // Add employee
                    Employe employee = createEmployee(sc);
                    Employees.addEmployee(employee);
                    break;
                case 2:
                    // Print all employees
                    Employees.print();
                    break;
                case 3:
                    // Search employee using all fields
                    System.out.print("Enter ID, Name, Salary to search: ");
                    Employe emp = createEmployee(sc);
                    Employees.searchEmployee(emp);
                    break;
                case 4:
                    // Search employee by ID only
                    System.out.print("Enter ID to search: ");
                    int searchId = sc.nextInt();
                    sc.nextLine();
                    Employees.searchById(searchId);
                    break;
                case 5:
                    // Delete employee using full object
                    System.out.print("Enter ID, Name, Salary to delete: ");
                    Employe toDelete = createEmployee(sc);
                    Employees.deleteEmployee(toDelete);
                    break;
                case 6:
                    // Delete employee by ID
                    System.out.print("Enter ID to delete: ");
                    int delId = sc.nextInt();
                    sc.nextLine();
                    Employees.deleteById(delId);
                    break;
                case 7:
                    // Update employee by ID
                    System.out.print("Enter ID to update: ");
                    int upId = sc.nextInt();
                    sc.nextLine();
                    Employees.updateById(upId, sc);
                    break;
                case 8:
                    // Sort employee list by ID
                    Employees.sortById();
                    break;
                case 0:
                    // Exit the application
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

    // Helper method to read employee input from user
    public static Employe createEmployee(Scanner sc) {
        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        return new Employe(id, name, salary);
    }
}
