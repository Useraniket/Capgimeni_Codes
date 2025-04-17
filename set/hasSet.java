package set;

import java.util.*;

public class hasSet {
	public static void main(String[] args) {
		Set<Integer> st = new HashSet<Integer>();
		st.add(10);
		st.add(40);
		st.add(40);
		st.add(0);                                 
		st.add(1000);
		System.out.println(st);
	}
}
