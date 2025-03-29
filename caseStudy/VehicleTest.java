package caseStudy;


import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

     
        Vehicle car = new Car("BMW", 60);
        Vehicle bike = new Bike("Royal Enfield", 20);
        Vehicle truck = new Truck("Volvo", 40);

      
        car.start();
        car.displaySpeed();
        car.accelerate(20);
        car.brake(10);
        System.out.println("Current Speed: " + car.getCurrentSpeed() + " km/h");
        car.stop();
        System.out.println("------------------------");

        bike.start();
        bike.displaySpeed();
        bike.accelerate(15);
        bike.brake(5);
        System.out.println("Current Speed: " + bike.getCurrentSpeed() + " km/h");
        bike.stop();
        System.out.println("------------------------");

        truck.start();
        truck.displaySpeed();
        truck.accelerate(30);
        truck.brake(20);
        System.out.println("Current Speed: " + truck.getCurrentSpeed() + " km/h");
        truck.stop();
        System.out.println("------------------------");

       
        sc.close();
    }
}
