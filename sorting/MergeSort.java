package sorting;


public class MergeSort {

    // Main function to start sorting
    public static void mergeSort(int[] arr, int start, int end) {
        if (start >= end) return; // base case

        int mid = start + (end - start) / 2;


        mergeSort(arr, start, mid);

        mergeSort(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    
      
     
    public static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];

        int i = start;     // pointer for left part
        int j = mid + 1;   // pointer for right part
        int k = 0;         // pointer for temp array

        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // Copy remaining elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // Copy temp back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }

    // Helper to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method to test it
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 4, 2, 7, 1, 6 };

        System.out.println("Before sorting:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("After sorting:");
        printArray(arr);
    }
}
