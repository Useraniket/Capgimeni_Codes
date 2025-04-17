//package SetCaseStudy2;
//
//import java.util.*;
//
//public class driver {
//	public static void main(String[] args) {
//		Set<Books> st = new TreeSet<>();
//
//		st.add(new Books(1, "Merchant of Venice", 560.0));
//		st.add(new Books(2, "Can We Be Strangers Again", 400.0));
//		st.add(new Books(3, "Othello", 1000.0));
//
//		for (Books b : st) {
//			System.out.println(b);
//		}
//	}
//}
//------------------------------------------------------------------
package SetCaseStudy2;

import java.util.*;

public class driver {
	public static void main(String[] args) {
		// 👉 Use whichever comparator you like:
		// Set<Books> st = new TreeSet<>(new SortById());
		// Set<Books> st = new TreeSet<>(new SortByTitle());
		Set<Books> st = new TreeSet<>(new SortByTitle());

		st.add(new Books(1, "Merchant of Venice", 560.0));
		st.add(new Books(2, "Can We Be Strangers Again", 400.0));
		st.add(new Books(3, "Othello", 1000.0));

		for (Books b : st) {
			System.out.println(b);
		}
	}
}
