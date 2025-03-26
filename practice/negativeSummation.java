package practice;

import java.util.Scanner;

public class negativeSummation {
    

    public static int count(int[] arr) {
        int n = arr.length;
        int count = 0;

        
        for (int i = 0; i < n; i++) {
            int sum = 0; 

            for (int j = i; j < n; j++) {
                sum += arr[j];

                if (sum < 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();  
        int[] arr = new int[n];

  
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

         
        System.out.println("Number of subarrays with a negative sum: " + count(arr));
        
        sc.close();  
    }
}
