package probsolvingString;

import java.util.ArrayList;
import java.util.List;

//1. Find All Substrings
//Write a function to find all possible substrings of a given string.
//•	Example:
//Input: "abc"
//Output: ["a", "b", "c", "ab", "bc", "abc"]

public class FindAllSubstrings {
	public static List<String> subString(String str) {
        List<String> substrings = new ArrayList<>();
        int length = str.length();

        for (int start = 0; start < length; start++) {
            for (int end = start + 1; end <= length; end++) {
                substrings.add(str.substring(start, end));
            }
        }
        
        return substrings;
    }
	
public static void main(String[] args) {
	String s="abc";
	List<String> result = subString(s);
    System.out.println(result);
}
}

//When start = 0:
//end = 1: Substring is "a" (indices 0 to 1).
//end = 2: Substring is "ab" (indices 0 to 2).
//end = 3: Substring is "abc" (indices 0 to 3).

//When start = 1:
//end = 2: Substring is "b" (indices 1 to 2).
//end = 3: Substring is "bc" (indices 1 to 3).

//When start = 2:
//end = 3: Substring is "c" (indices 2 to 3).
