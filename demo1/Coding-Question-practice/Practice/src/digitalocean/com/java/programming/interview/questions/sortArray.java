package digitalocean.com.java.programming.interview.questions;

import java.util.Arrays;

public class sortArray {

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 6, 1, 8};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) { 
            for (int j = i + 1; j < arr.length; j++) { 
                if (arr[i] > arr[j]) { // Fixing the condition
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Bubble Sort >> Sorted Array:: " + Arrays.toString(arr));
        
        //Arrays.sortMethod , O(n log n) (uses Dual-Pivot QuickSort)
        Arrays.sort(arr);
        System.out.println("Arrays.sort(arr) :: "+Arrays.toString(arr));
        
        //selection sort
        
       // 🔹 Time Complexity: O(n²) (Not the best for large arrays)
       // 🔹 How It Works: Finds the smallest element and swaps it with the current index
        
        
        
    }
}
