package sorting; // Declares the package name for organizing classes
import java.util.*; // Imports utility classes like Scanner


public class selectionSort { // Defines the main class named selectionSort

public static void selectionSort(int[] arr) { // Method to sort array using selection sort algorithm
    int n = arr.length; // Store the length of the array in variable n
    for(int i = 0; i < n-1; i++) { // Outer loop: iterate through array from first to second-to-last element
        int minIndex = i; // Assume current position i has the minimum element
        for(int j = i+1; j < n; j++) { // Inner loop: search for minimum element in unsorted portion
            if(arr[j] < arr[minIndex]) { // Compare current element with assumed minimum
                minIndex = j; // Update minIndex if a smaller element is found
            }
        }
        if(minIndex != i) { // Check if minimum element is not at current position
            int temp = arr[minIndex]; // Store minimum element in temporary variable
            arr[minIndex] = arr[i]; // Move element at position i to minIndex position
            arr[i] = temp; // Place minimum element at position i
        }
    }
}

public static void main(String[] args) { // Main method where program execution starts
    Scanner sc = new Scanner(System.in); // Create Scanner object to read input from user
    System.out.println("Enter the number of elements in the array: "); // Prompt user for array size
    int n = sc.nextInt(); // Read the number of elements from user input
    int[] arr = new int[n]; // Create an array of size n to store elements
    System.out.println("Enter the elements of the array: "); // Prompt user to enter array elements
    for(int i = 0; i < n; i++) { // Loop to read n elements from user
        arr[i] = sc.nextInt(); // Read each element and store in array at index i
    }
    sc.close(); // Close the Scanner to free resources
    selectionSort(arr); // Call selectionSort method to sort the array
    System.out.println("The sorted array is: "); // Print message before displaying sorted array
    for(int i = 0; i < n; i++) { // Loop to print all elements of sorted array
        System.out.print(arr[i] + " "); // Print each element followed by a space
    }
    System.out.println(); // Print a newline to end the output properly
}
}
