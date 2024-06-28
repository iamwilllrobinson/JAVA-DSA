public class construct_pallindrone {
    public boolean canConstruct(String s, int k) {
        int n = s.length();

        // If the length of the string is less than k, it's impossible
        if (n < k) {
            return false;
        }

        // Frequency array to count occurrences of each character
        int[] charCount = new int[26];
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
        }

        // Count the number of characters with an odd frequency
        int oddCount = 0;
        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // We can construct the palindromes if the number of odd-frequency characters
        // is less than or equal to k
        return oddCount <= k;
    }

    public static void main(String[] args) {
        construct_pallindrone sol = new construct_pallindrone();

        System.out.println(sol.canConstruct("annabelle", 2)); // Output: true
        System.out.println(sol.canConstruct("leetcode", 3));  // Output: false
        System.out.println(sol.canConstruct("racecar", 1));   // Output: true
        System.out.println(sol.canConstruct("aabbcc", 3));    // Output: true
    }
}
