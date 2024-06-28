import java.util.ArrayList;
import java.util.Collections;

public class Duplicate {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // Initialize the result list
        ArrayList<Integer> result = new ArrayList<>();

        // Iterate through the array and mark visited elements
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Check for duplicates
        for (int i = 0; i < n; i++) {
            if (arr[i] / n > 1) {
                result.add(i);
            }
        }

        // If no duplicates were found, add -1 to result
        if (result.isEmpty()) {
            result.add(-1);
        }

        // Return the result
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] arr1 = {13,15,13};
        System.out.println(duplicates(arr1, arr1.length));

     }
}
