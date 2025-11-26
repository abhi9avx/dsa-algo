package sorting;
import java.util.*;

public class bubbleSort {
    
// Bubble Sort: Repeatedly compares adjacent elements and swaps them if they are in wrong order
// After each pass, the largest element "bubbles up" to its correct position
public static void bubbleSort(int[] arr) {
    int n = arr.length;
    // Outer loop: number of passes needed (n-1 passes for n elements)
    for (int i = 0; i < n-1; i++) {
        // Inner loop: compare adjacent elements, reduce range by i since last i elements are already sorted
        for (int j = 0; j < n-i-1; j++) {
            // Swap if current element is greater than next element
            if (arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
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
    bubbleSort(arr);
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