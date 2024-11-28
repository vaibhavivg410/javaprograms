package probsolvingString;
//7. Longest Palindromic Substring
//Write a function to find the longest palindromic substring in a given string.
//•	Example:
//Input: "babad"
//Output: "bab" or "aba"

public class LongestPalindromeSubstring {
    public static String longPalindrome(String str) {
        if (str == null || str.length() < 1) {
            return "";
        }

        int start = 0, end = 0;

        for (int i = 0; i < str.length(); i++) {
            int len1 = expandAroundCenter(str, i, i);   // Odd length palindrome
            int len2 = expandAroundCenter(str, i, i + 1); // Even length palindrome
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    private static int expandAroundCenter(String str, int left, int right) {
        while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1; // Length of the palindrome
    }

    public static void main(String[] args) {
        String str = "babad";
        String longestPalindrome = longPalindrome(str);
        System.out.println("Longest Palindromic Substring: " + longestPalindrome);
    }
}

