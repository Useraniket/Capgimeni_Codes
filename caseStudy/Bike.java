package caseStudy;

class Bike extends AbstractVehicle {

    public Bike(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " Bike is starting.");
    }

    @Override
    public void stop() {
        System.out.println(name + " Bike is stopping.");
    }

    @Override
    public void displaySpeed() {
        System.out.println("Current speed of " + name + " is " + speed + " km/h.");
    }
}
