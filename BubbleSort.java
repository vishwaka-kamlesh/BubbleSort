import java.util.*;

class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 10, 6, 4, 8, 2 };
        sort(arr); // Call the sort function to sort the array
        System.out.println(Arrays.toString(arr)); // Print the sorted array
    }
    
    // Bubble sort function to sort the array in ascending order
    static void sort(int[] arr) {
        boolean isSwapped; // A flag to track if any elements are swapped during a pass
        int temp; // Temporary variable for swapping elements
        
        // Outer loop to traverse the array
        for (int i = 0; i < arr.length - 1; i++) {
            isSwapped = false; // Set the swapped flag to false at the beginning of each pass
            
            // Inner loop to compare and swap adjacent elements
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // If the current element is smaller than the previous element, swap them
                    temp = arr[j];
                    arr[j] =  arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped = true; // Set the swapped flag to true, indicating a swap occurred
                }
            }
            
            // If no swap occurred during the pass, the array is already sorted, so break the loop early
            if (!isSwapped) {
                break;
            }
        }
    }
}
