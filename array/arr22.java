package array;

import java.util.Arrays;

public class arr22 {
public static void main(String[] args) {
	int arr1[]= {1,2,3,4,5,6,7};
	System.out.println(Arrays.toString(arr1));
	int arr2[]=changeArray(arr1);
	System.out.println(Arrays.toString(arr2));
}
public static int[] changeArray(int[]array) {
	array=new int[2];
	array[0]=100;
	return array;
}
}
