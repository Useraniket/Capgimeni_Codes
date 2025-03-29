package caseStudy;

import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating vehicle objects
        Vehicle car = new Car("BMW", 60);
        Vehicle bike = new Bike("Royal Enfield", 20);
        Vehicle truck = new Truck("Volvo", 40);

        while (true) {
            System.out.println("Select a vehicle to display details:");
            System.out.println("1. Car\n2. Bike\n3. Truck\n4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printVehicleDetails(car);
                    break;
                case 2:
                    printVehicleDetails(bike);
                    break;
                case 3:
                    printVehicleDetails(truck);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    sc.close();
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
            System.out.println("------------------------");
        }
    }

    // Method to print vehicle details
    public static void printVehicleDetails(Vehicle vehicle) {
        vehicle.start();
        vehicle.displaySpeed();
        vehicle.accelerate(20);
        vehicle.brake(10);
        System.out.println("Current Speed: " + vehicle.getCurrentSpeed() + " km/h");
        vehicle.stop();
    }
}
