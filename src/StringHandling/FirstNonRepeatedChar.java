package StringHandling;

import java.util.LinkedHashMap;
import java.util.Map;

//4. Find First Non-Repeated Character
//Given a string, find the first non-repeated character in it.

public class FirstNonRepeatedChar {
	public static char firstNonRepeatedChar(String input) {
	    Map<Character, Integer> charCount = new LinkedHashMap<>();
	    for (char c : input.toCharArray()) {
	        charCount.put(c, charCount.getOrDefault(c, 0) + 1);
	    }
	    for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
	        if (entry.getValue() == 1) {
	            return entry.getKey();
	        }
	    }
	    return '\0'; // Return null character if all are repeated
	}

public static void main(String[] args) {
	String input="loveleetcode";
	FirstNonRepeatedChar f=new FirstNonRepeatedChar();
	System.out.println(f.firstNonRepeatedChar(input));
}
}
