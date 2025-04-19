package lambda;

interface Vehicle {
    void operate();
}

public class ex1 {
    public static void main(String[] args) {
        Vehicle car = () -> System.out.println("operating");
        car.operate();
    }
}
