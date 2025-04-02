package exception;

import java.util.Scanner;

public class array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		try {
			for (int i = 0; i < n; i++) {
				System.out.println(arr[6]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Handled");
		}
		String str=null;
		try
		{
			System.out.println(str.length());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("Handled");
		}
	}
}
