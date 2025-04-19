package map;
import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        // Adding entries (put)
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Date");

        // Display entire map
        System.out.println("Initial LinkedHashMap: " + map);

        // Accessing elements
        System.out.println("Value at key 2: " + map.get(2));
        System.out.println("Get or default (key 5): " + map.getOrDefault(5, "Not Found"));

        // Updating a value
        map.put(2, "Blueberry");
        System.out.println("After updating key 2: " + map);

        // Using putIfAbsent
        map.putIfAbsent(5, "Elderberry");
        map.putIfAbsent(2, "Blackberry"); // won't update as key 2 exists
        System.out.println("After putIfAbsent: " + map);

        // Removing entries
        map.remove(3); // remove by key
        map.remove(4, "Date"); // remove by key and value condition
        System.out.println("After removals: " + map);

        // Replace values
        map.replace(1, "Avocado");
        map.replace(10, "Guava"); // won't replace, key 10 doesn't exist
        System.out.println("After replace: " + map);

        // Check if contains key/value
        System.out.println("Contains key 1? " + map.containsKey(1));
        System.out.println("Contains value 'Avocado'? " + map.containsValue("Avocado"));

        // Iterating through keys
        System.out.println("\nKeys:");
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }

        // Iterating through values
        System.out.println("\nValues:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Iterating through key-value pairs (entries)
        System.out.println("\nEntries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Size of map
        System.out.println("\nSize of map: " + map.size());

        // Clearing the map
        map.clear();
        System.out.println("After clear: " + map);
    }
}
