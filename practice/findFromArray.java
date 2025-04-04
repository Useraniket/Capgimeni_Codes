package practice;

import java.util.Arrays;
import java.util.Scanner;

public class findFromArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in the array");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int store = 0;
		for (int i = 0; i < n; i++) {
				if (arr[i] == store) {
		         store++;
			}
		}
		System.err.println("the missing number is:"+store);
		
	}
}
