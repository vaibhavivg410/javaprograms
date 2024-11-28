package probsolvingString;
import java.util.HashMap;
import java.util.Stack;
	public class ValidParenthesis {

	    public static boolean isValid(String input) {
	        Stack<Character> stack = new Stack<>();
	        // Map to hold matching pairs
	       HashMap<Character, Character> pairs = new HashMap<>();
	        pairs.put(')', '(');
	        pairs.put(']', '[');
	        pairs.put('}', '{');

	        for (char c : input.toCharArray()) {
	            // If it's an opening bracket, push to stack
	            if (pairs.containsValue(c)) {
	                stack.push(c);
	            } 
	            // If it's a closing bracket
	            else if (pairs.containsKey(c)) {
	                // Check if the stack is empty or the top doesn't match
	                if (stack.isEmpty() || stack.pop() != pairs.get(c)) {
	                    return false;
	                }
	            }
	        }
	        
	        // Valid if stack is empty at the end
	        return stack.isEmpty();
	    }

	    public static void main(String[] args) {
	        String input = "()[]{}";
	        boolean output = isValid(input);
	        System.out.println(output); // Output: true
	    }
	
}
	
//	Character	Action			Stack State	Output
//	(			Push to stack	['(']	
//	)			Pop from stack	[]			Valid so far
//	[			Push to stack	['[']	
//	]			Pop from stack	[]			Valid so far
//	{			Push to stack	['{']	
//	}			Pop from stack	[]			Valid so far
