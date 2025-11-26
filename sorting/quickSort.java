package sorting;
import java.util.*;

public class quickSort {
    
    // Quick Sort: Divide and conquer algorithm that partitions array around a pivot element
    public static void quickSort(int[] nums) {
        quickSortHelper(nums, 0, nums.length - 1);
    }

    // Recursive helper method to sort array using quick sort
    private static void quickSortHelper(int[] arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            quickSortHelper(arr, low, pIndex - 1);
            quickSortHelper(arr, pIndex + 1, high);
        }
    }

    // Partition method: places pivot at correct position and returns its index
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            // Find element greater than pivot from left
            while (i <= high - 1 && arr[i] <= pivot) {
                i++;
            }

            // Find element smaller than pivot from right
            while (j >= low + 1 && arr[j] > pivot) {
                j--;
            }

            // Swap if both elements are found
            if (i < j) {
                swap(arr, i, j);
            }
        }

        // Place pivot at its correct position
        swap(arr, low, j);
        return j;
    }

    // Helper method to swap two elements in array
    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        quickSort(arr);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    // Helper method to print array elements
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}