public class Solution {

    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {
        // If there's only one element, it's the equilibrium point
        if (n == 1) {
            return 1;
        }

        // Calculate the total sum of the array elements
        long totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        // Initialize leftSum as 0
        long leftSum = 0;

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Update totalSum to be the right sum by subtracting the current element
            totalSum -= arr[i];

            // Check if leftSum equals the updated totalSum (right sum)
            if (leftSum == totalSum) {
                return i + 1; // Return 1-based index
            }

            // Update leftSum by adding the current element
            leftSum += arr[i];
        }

        // If no equilibrium point is found, return -1
        return -1;
    }

    // Main method for testing
    public static void main(String[] args) {
        long[] arr1 = {1, 2, 3, 1, 2};
        System.out.println(equilibriumPoint(arr1, arr1.length)); // Output: 3

        long[] arr2 = {1, 2, 3};
        System.out.println(equilibriumPoint(arr2, arr2.length)); // Output: -1
    }
}
