package probsolvingString;
//4. Count and Say Sequence
//Write a function that returns the n-th term in the "count-and-say" sequence. The sequence is defined 
//as follows: starting with "1", each subsequent term describes the previous term.
//•	Example:
//Input: 4
//Output: "1211" (The sequence goes: "1", "11", "21", "1211", ...)

public class CountAndSaySeq {

	    public static String countAndSay(int n) {
	        // Starting term
	        String result = "1";

	        // Generate terms from 2 to n
	        for (int i = 2; i <= n; i++) {
	            StringBuilder nextTerm = new StringBuilder();
	            int count = 1;

	            // Iterate over the current term
	            for (int j = 1; j < result.length(); j++) {
	                // If the current digit is the same as the previous one
	                if (result.charAt(j) == result.charAt(j - 1)) {
	                    count++; // Increment the count
	                } else {
	                    // Append the count and the digit to the next term
	                    nextTerm.append(count).append(result.charAt(j - 1));
	                    count = 1; // Reset count
	                }
	            }

	            // Append the last counted digit
	            nextTerm.append(count).append(result.charAt(result.length() - 1));
	            result = nextTerm.toString(); // Update result to the next term
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int n = 4;
	        String output = countAndSay(n);
	        System.out.println(output); // Output: "1211"
	    }
	}

