package caseStudy;

abstract class AbstractVehicle implements Vehicle {
    protected String name;
    protected int speed;

    public AbstractVehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void displayDetails() {
        System.out.println("The name of the vehicle: " + name);
        System.out.println("The speed of the vehicle: " + speed);
    }

    @Override
    public void accelerate(int increment) {
        speed += increment;
    }

    @Override
    public void brake(int decrement) {
        speed -= decrement;
        if (speed < 0) speed = 0;
    }

    @Override
    public int getCurrentSpeed() {
        return speed;
    }
}
