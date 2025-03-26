package inheritance;

public class Car extends Vehicle {

public Car(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, int numberOfDoors) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.numberOfDoors=numberOfDoors;
	}
 private int numberOfDoors;

public int getNumberOfDoors() {
	return numberOfDoors;
}
public void setNumberOfDoors(int numberOfDoors) {
	this.numberOfDoors = numberOfDoors;
}
public void displayDetails()
{
	System.out.println("The number of door is:"+getNumberOfDoors());
}
}
