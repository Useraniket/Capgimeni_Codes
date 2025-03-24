package array;

import java.util.*;
public class arrays {
 public static void main(String[] args) {
	int arr[]= {1,2,3,4,5,6,7};
	//arr=Arrays.copyOf(arr, 10);
	//System.out.println(Arrays.toString(arr));
	//arr=Arrays.copyOfRange(arr, 1, 6);
	//System.out.println(Arrays.toString(arr));
	System.out.println(Arrays.binarySearch(arr, 99));
}
}
