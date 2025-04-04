package Searching;

import java.util.Scanner;

public class sample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        
  
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       
        System.out.println("Enter the target element:");
        int target = sc.nextInt();
        
        int[] result = findFirstAndLast(arr, target);


        if (result[0] != -1) {
            System.out.println("First occurrence: " + result[0] + ", Last occurrence: " + result[1]);
        } else {
            System.out.println("[-1, -1]");
        }
    }

    public static int[] findFirstAndLast(int[] arr, int target) {
        int[] result = new int[2]; 
        result[0] = binarySearch(arr, target, true);  
        result[1] = binarySearch(arr, target, false);
        return result;
    }

    
    public static int binarySearch(int[] arr, int target, boolean isFirst) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                result = mid;
                if (isFirst) {
                    end = mid - 1;  
                } else {
                    start = mid + 1;  
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return result;
    }
}
