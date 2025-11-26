package sorting;
import java.util.*;

public class insertionSort {
    
// Insertion Sort: Builds sorted array one element at a time by inserting each element in its correct position
public static void insertionSort(int[] arr) {
    int n = arr.length;
    // Start from index 1, as element at index 0 is considered already sorted
    for(int i = 1; i < n; i++) {
        int j = i;
        // Move elements greater than current element one position ahead
        while(j > 0 && arr[j-1] > arr[j]) {
            int temp = arr[j];
            arr[j] = arr[j-1];
            arr[j-1] = temp;
            j--;
        }
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
    insertionSort(arr);
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