package employeeManagementSystem;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------WELCOME-----------------------------------");
       
        while (true) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. ADD EMP");
            System.out.println("2. PRINT ALL EMP");
            System.out.println("3. SEARCH EMP BY NAME");
            System.out.println("4. SEARCH EMP BY ID");
            System.out.println("0. EXIT");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    Employe employee = createEmployee(sc);
                    Employees.addEmployee(employee);
                    break;

                case 2:
                    Employees.print();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    Employe  emp = createEmployee(sc);
                    Employees.searchEmployee(emp);
                    break;

                case 4:
                    System.out.print("Enter ID to search: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    Employees.searchById(id);
                    break;

                case 0:
                    System.out.println("Exiting... Thank you!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Try again!");
            }
        }
    }

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