package sorting;
import java.util.*;


public class selectionSort {

public static void selectionSort(int[] arr) {
    int n = arr.length;
    for(int i = 0; i < n-1; i++) {
        int minIndex = i;
        for(int j = i+1; j < n; j++) {
            if(arr[j] < arr[minIndex]) {    
                minIndex = j;
            }
        }
        if(minIndex != i) { 
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }
    sc.close();
    selectionSort(arr);
    System.out.println("The sorted array is: ");
    for(int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
}
