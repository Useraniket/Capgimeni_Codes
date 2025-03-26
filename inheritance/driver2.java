package inheritance;

public class driver2 {
    public static void main(String[] args) {
     
        Bike b = new Bike("MH6969", "Yamaha", "FZ", 5800, true, true);
        Car c = new Car("M1234", "Mahindra", "XUV", 10000, true, 4);

      
        b.display();
        c.display();
    }
}
