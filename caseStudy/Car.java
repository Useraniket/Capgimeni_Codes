package caseStudy;

class Car extends AbstractVehicle {

    public Car(String name, int speed) {
        super(name, speed);
    }

    @Override
    public void start() {
        System.out.println(name + " Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println(name + " Car is stopping.");
    }

    @Override
    public void displaySpeed() {
        System.out.println("Current speed of " + name + " is " + speed + " km/h.");
    }
}
