package set;

import java.util.*;

public class treeSet {
	public static void main(String[] args) {
		Set<Integer> st = new TreeSet<Integer>();
		st.add(10);
		st.add(40);
		st.add(60);
		st.add(0);
		st.add(1000);
		System.out.println(st);
	}
}
