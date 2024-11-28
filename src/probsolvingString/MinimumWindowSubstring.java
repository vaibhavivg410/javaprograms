package probsolvingString;
//8. Minimum Window Substring
//Given two strings, S and T, write a function that finds the minimum window in S which will contain all the characters in T.
//•	Example:
//Input: S = "ADOBECODEBANC", T = "ABC"
//Output: "BANC"

import java.util.HashMap;

public class MinimumWindowSubstring {
    public static String minWindow(String S, String T) {
        if (S == null || T == null || S.length() < T.length()) {
            return "";
        }

        HashMap<Character, Integer> charCountT = new HashMap<>();
        for (char c : T.toCharArray()) {
            charCountT.put(c, charCountT.getOrDefault(c, 0) + 1);
        }

        int required = charCountT.size();
        int formed = 0;
        HashMap<Character, Integer> charCountWindow = new HashMap<>();
        int left = 0, right = 0;
        int[] ans = { -1, 0, 0 }; // Length of window, left, right

        while (right < S.length()) {
            char c = S.charAt(right);
            charCountWindow.put(c, charCountWindow.getOrDefault(c, 0) + 1);

            // Check if the current character is part of T and if the count matches
            if (charCountT.containsKey(c) && charCountWindow.get(c).intValue() == charCountT.get(c).intValue()) {
                formed++;
            }

            // Try and contract the window until it ceases to be 'desirable'
            while (left <= right && formed == required) {
                char leftChar = S.charAt(left);

                // Save the smallest window and update the answer
                if (ans[0] == -1 || right - left + 1 < ans[0]) {
                    ans[0] = right - left + 1; // Length of window
                    ans[1] = left; // Left index
                    ans[2] = right; // Right index
                }

                // Remove the left character from the window
                charCountWindow.put(leftChar, charCountWindow.get(leftChar) - 1);
                if (charCountT.containsKey(leftChar) && charCountWindow.get(leftChar).intValue() < charCountT.get(leftChar).intValue()) {
                    formed--;
                }

                left++;
            }

            right++;
        }

        return ans[0] == -1 ? "" : S.substring(ans[1], ans[2] + 1);
    }

    public static void main(String[] args) {
        String S = "ADOBECODEBANC";
        String T = "ABC";
        String result = minWindow(S, T);
        System.out.println("Minimum Window Substring: " + result);
    }
}


