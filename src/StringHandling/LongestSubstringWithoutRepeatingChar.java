package StringHandling;

import java.util.HashSet;
import java.util.Set;

//8. Find Longest Substring Without Repeating Characters
//Write a method to find the longest substring in a given string that does not repeat characters.

public class LongestSubstringWithoutRepeatingChar {
	public static String longestUniqueSubstring(String input) {
	    String longest = "";
	    Set<Character> seen = new HashSet<>();
	    int start = 0;
	    
	    for (int end = 0; end < input.length(); end++) {
	        char c = input.charAt(end);
	        while (seen.contains(c)) {
	            seen.remove(input.charAt(start));
	            start++;
	        }
	        seen.add(c);
	        if (end - start + 1 > longest.length()) {
	            longest = input.substring(start, end + 1);
	        }
	    }
	    return longest;
	}

public static void main(String[] args) {
	String str="aghkabggafhkjkwq";
	LongestSubstringWithoutRepeatingChar l=new LongestSubstringWithoutRepeatingChar();
	System.out.println(l.longestUniqueSubstring(str));
}
}
