import java.util.ArrayList;
import java.util.Collections;
//check
public class median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> temp = new ArrayList<>();

        // Adding all elements of nums1 to the ArrayList
        for (int num : nums1) {
            temp.add(num);
        }

        // Adding all elements of nums2 to the ArrayList
        for (int num : nums2) {
            temp.add(num);
        }

        // Sorting the ArrayList
        Collections.sort(temp);

        // Finding the median
        int size = temp.size();
        double median;
        if (size % 2 == 1) {
            // Odd number of elements
            median = temp.get(size / 2);
        } else {
            // Even number of elements
            median = (temp.get((size / 2) - 1) + temp.get(size / 2)) / 2.0; // Ensure division is done in double
        }

        return median;
    }

    public static void main(String[] args) {
        median solution = new median();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median is: " + solution.findMedianSortedArrays(nums1, nums2));

        int[] nums1a = {1, 2};
        int[] nums2a = {3, 4};
        System.out.println("Median is: " + solution.findMedianSortedArrays(nums1a, nums2a));
    }
}
