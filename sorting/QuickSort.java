package sorting;

public class QuickSort {

    // Method to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the pivot element such that
            // elements smaller than pivot are on the left,
            // and elements greater than pivot are on the right
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Method to find the partition position
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the rightmost element as pivot
        int i = (low - 1); // Pointer for greater element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap elements at i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the greater element at i+1
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the partition point
        return (i + 1);
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }

    // Main method to test the sorting
    public static void main(String[] args) {
        int[] arr = { 38, 27, 43, 3, 9, 82, 10 };
        System.out.println("Unsorted array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
