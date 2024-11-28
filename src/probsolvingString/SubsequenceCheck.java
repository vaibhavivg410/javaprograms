package probsolvingString;
//9. Check if String is a Subsequence
//Given two strings, check if the first string is a subsequence of the second one.
//•	Example:
//Input: "abc", "ahbgdc"
//Output: true

public class SubsequenceCheck {
    public static boolean isSubsequence(String s1, String s2) {
        int s1Index = 0, s2Index = 0;

        while (s1Index < s1.length() && s2Index < s2.length()) {
            if (s1.charAt(s1Index) == s2.charAt(s2Index)) {
                s1Index++;
               
            }
            s2Index++;
        }

        return s1Index == s1.length(); // Check if all characters in s1 were found
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ahbgdc";
        boolean result = isSubsequence(s1, s2);
        System.out.println("Is subsequence: " + result);
    }
}

