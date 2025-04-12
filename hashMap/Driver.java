package hashMap;


public class Driver {
    public static void main(String[] args) {
        Implementation map = new Implementation();
//        map.put(1, "One");
//        map.put(2, "Two");
//        map.put(3, "Three");
//
//        System.out.println(map.get(2)); // Output: Two
//
//        map.put(2, "Two Updated");
//        System.out.println(map.get(2)); // Output: Two Updated
//
//        map.remove(3);
//        System.out.println(map.get(3)); // Output: null
        
        map.put(10, "Ten");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(25, "Twenty Five");
        map.put(50, "Fifty");

        map.display();
    }
}
