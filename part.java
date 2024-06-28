public class part {

    // Function to replace every digit in x with the largest digit in x
    public int encrypt(int x) {
        int maxDigit = 0;
        int temp = x;

        // Find the largest digit in the number
        while (temp > 0) {
            int digit = temp % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            temp /= 10;
        }

        // Create the encrypted number
        int encryptedNum = 0;
        int multiplier = 1;
        while (x > 0) {
            encryptedNum += maxDigit * multiplier;
            multiplier *= 10;
            x /= 10;
        }

        return encryptedNum;
    }

    // Function to calculate the sum of encrypted elements
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += encrypt(num);
        }
        return sum;
    }

    // Main method for testing
    public static void main(String[] args) {
        part sol = new part();

        int[] nums1 = {1, 2, 3};
        System.out.println(sol.sumOfEncryptedInt(nums1)); // Output: 6

        int[] nums2 = {10, 21, 31};
        System.out.println(sol.sumOfEncryptedInt(nums2)); // Output: 66
    }
}
