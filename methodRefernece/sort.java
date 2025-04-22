//package methodRefernece;
//
//import java.util.*;
//
//public class sort {
//    public static void main(String[] args) {
//        List<String> l1 = Arrays.asList("Abc", "Bcd");
//
//        // Correct sorting using lambda
//        l1.sort((a, b) -> a.compareTo(b));
//
//        // Or better, use method reference
//        // l1.sort(String::compareTo);
//
//        System.out.println(l1);
//    }
//}
//----------------------------using method reference----------------------------------
package methodRefernece;

import java.util.*;

public class sort {
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("Abc", "Bcd");

		// Method reference instead of lambda
		l1.sort(String::compareTo);

		System.out.println(l1);
	}
}
