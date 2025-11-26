package sorting;
import java.util.*;

public class mergeSort {

    // Merge Sort: Divide and conquer algorithm that divides array into halves, sorts them, and merges back
    public static void mergeSort(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        mergesorting(arr, 0, arr.length - 1);
    }

    // Recursive method to divide array into halves and sort them
    private static void mergesorting(int[] nums, int low, int high) {
        // Base case: 1 element or invalid range
        if (low >= high) return;
        
        int mid = low + (high - low) / 2; // Exact mid between low..high
        
        // Sort left half: low..mid
        mergesorting(nums, low, mid);
        
        // Sort right half: mid+1..high
        mergesorting(nums, mid + 1, high);
        
        // Merge the two halves back into nums[low..high]
        merged(nums, low, mid, high);
    }

    // Merge two sorted halves into a single sorted array
    private static void merged(int[] arr, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int left = low;      // Runs over low..mid
        int right = mid + 1; // Runs over mid+1..high
        int k = 0;
        
        // Merge while both halves have items
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) 
                temp[k++] = arr[left++];
            else 
                temp[k++] = arr[right++];
        }
        
        // Copy leftovers from left half
        while (left <= mid) 
            temp[k++] = arr[left++];
        
        // Copy leftovers from right half
        while (right <= high) 
            temp[k++] = arr[right++];
        
        // Write merged result back to arr[low..high]
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
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
    mergeSort(arr);
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