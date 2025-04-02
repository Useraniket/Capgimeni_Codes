package practice;

import java.util.Scanner;

public class array {
	public static int maxSum(int[][] arr) {
		int maxsum=Integer.MIN_VALUE;
		int sum;
		for(int i=0;i<arr.length;i++)
		{
			sum=0;
			for(int j=0;j<arr[i].length;j++)
			{
				sum+=arr[i][j];
			}
			maxsum=Math.max(maxsum, sum);
			
		}
		return maxsum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n = sc.nextInt();
		System.out.println("Enter then number of collumns");
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("Max Sum:" + maxSum(arr));
		sc.close();
	}
}
