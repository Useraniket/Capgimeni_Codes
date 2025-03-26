package inheritance;


public class Vehicle {
	private String vehicleNumber;
	private String brand;
	private String model;
	private double rentalPricePerDay;
	private boolean isAvailable;
	public Vehicle(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable) 
	{
		this.vehicleNumber = vehicleNumber;
		this.brand = brand;
		this.model = model;
		this.rentalPricePerDay = rentalPricePerDay;
		this.isAvailable = isAvailable;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getRentalPricePerDay() {
		return rentalPricePerDay;
	}
	public void setRentalPricePerDay(double rentalPricePerDay) {
		this.rentalPricePerDay = rentalPricePerDay;
	}
	public boolean getisAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public void display()
	{
		System.out.println("The Vehicle number is:"+getVehicleNumber());
		System.out.println("The Brand is:"+getBrand());
		System.out.println("The model is:"+getModel());
		System.out.println("The rental price per day is:"+getRentalPricePerDay());
	}
	public void rentVehicle()
	{
		if(getisAvailable()==true)
		{
			System.out.println("Vehicle is available");
		}
		else
		{
			System.out.println("Vehicle is not available");
		}
	}
	
}
