package practice;

import java.util.*;

public class ex1 {
	public static void main(String[] args) {
		ArrayList<Double> arr = new ArrayList<Double>();
		arr.add(18.0);
		arr.add(19.2);
		arr.add(12.0);
		arr.add(10.8);


       	arr.sort((n1, n2) -> Double.compare(n2,n1));

		System.out.println("Sorted in reverse:" + arr);
		
	}
}
