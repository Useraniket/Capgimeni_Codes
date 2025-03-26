package inheritance;

public class Bike extends Vehicle{
 private boolean hasGear;
	public Bike(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, boolean hasGear) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.hasGear=hasGear;
	}
	
	public boolean getisHasGear() {
		return hasGear;
	}

	public void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}

	public void displayDetails()
	{
		if(hasGear=true)
		System.out.println("Has gear");
	}

}
