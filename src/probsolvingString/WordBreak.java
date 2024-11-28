package probsolvingString;
//10. Word Break Problem
//Given a string and a dictionary of words, determine if the string can be segmented into a space-separated sequence of dictionary words.
//•	Example:
//Input: "applepenapple", ["apple", "pen"]
//Output: true

import java.util.HashSet;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> wordSet = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true; // An empty string can always be segmented

        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // No need to check further, we found a valid segmentation
                }
            }
        }

        return dp[s.length()]; // Return whether the whole string can be segmented
    }

    public static void main(String[] args) {
        String s = "applepenapple";
        List<String> wordDict = List.of("apple", "pen");
        boolean result = wordBreak(s, wordDict);
        System.out.println("Can the string be segmented: " + result);
    }
}
