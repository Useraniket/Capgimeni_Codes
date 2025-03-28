package practice;

import java.util.Scanner;

public class maxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0; 

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            currSum = Math.max(num, currSum + num); 
            maxSum = Math.max(maxSum, currSum);        }

        System.out.println("The maximum sum is: " + maxSum);
    }
}
