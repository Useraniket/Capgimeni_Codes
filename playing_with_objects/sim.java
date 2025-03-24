package playing_with_objects;

public class sim {
    public static void main(String[] args) {
        lazyphone l = new lazyphone();
        System.out.println(l);
        System.out.println(l.phone); 
        
        l.newSim();
    }
}
