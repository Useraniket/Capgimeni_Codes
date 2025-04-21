package caseStudy_21_2;
import java.util.*;

public class driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FlightsScheduleManager manager = new FlightsScheduleManager();

        System.out.println("How many flights do you want to add?");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("\nIs this flight International or Domestic? (I/D):");
            String type = scanner.nextLine().trim().toUpperCase();

            System.out.print("Flight ID: ");
            String id = scanner.nextLine();
            System.out.print("Departure Time (HH:MM): ");
            String dep = scanner.nextLine();
            System.out.print("Arrival Time (HH:MM): ");
            String arr = scanner.nextLine();
            System.out.print("Available Seats: ");
            int seats = scanner.nextInt();
            scanner.nextLine(); // consume newline

            if (type.equals("I")) {
                System.out.print("Country Code: ");
                String cc = scanner.nextLine();
                manager.addFlight(new InternationalFlight(id, dep, arr, seats, cc));
            } else if (type.equals("D")) {
                System.out.print("State Code: ");
                String sc = scanner.nextLine();
                manager.addFlight(new DomesticFlight(id, dep, arr, seats, sc));
            } else {
                System.out.println("Invalid type. Skipping this flight.");
            }
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Book a Flight");
            System.out.println("2. Show Available Flights");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Enter Flight ID to book: ");
                String bookId = scanner.nextLine();
                System.out.print("Enter number of seats to book: ");
                int count = scanner.nextInt();
                scanner.nextLine(); 
                boolean booked = manager.bookFlight(bookId, count);
                System.out.println(booked ? "Booking successful!" : "Booking failed or not enough seats.");
            } else if (choice == 2) {
                System.out.print("Enter start time (HH:MM): ");
                String start = scanner.nextLine();
                System.out.print("Enter end time (HH:MM): ");
                String end = scanner.nextLine();
                List<Flight> available = manager.getAvailableFlight(start, end);
                if (available.isEmpty()) {
                    System.out.println("No flights available in this time range.");
                } else {
                    for (Flight f : available) {
                        System.out.println(f.getFlightInfo());
                    }
                }
            } else if (choice == 3) {
                System.out.println("Thank you. Exiting...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}