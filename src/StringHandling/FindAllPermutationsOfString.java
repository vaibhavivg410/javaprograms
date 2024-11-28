package StringHandling;
//10. Find All Permutations of a String
//Write a method to print all permutations of a given string.

public class FindAllPermutationsOfString {
	
	public static void findPermutations(String input) {
	    permute(input, "");
	}

	private static void permute(String input, String result) {
	    if (input.length() == 0) {
	        System.out.println(result);
	        return;
	    }
	    for (int i = 0; i < input.length(); i++) {
	        char c = input.charAt(i);
	        String remainder = input.substring(0, i) + input.substring(i + 1);
	        permute(remainder, result + c);
	    }
	}

public static void main(String[] args) {
	String input="pqr";
	FindAllPermutationsOfString f=new FindAllPermutationsOfString();
	f.findPermutations(input);
}
}


//Initial Call:
//findPermutations("pqr") → Calls permute("pqr", "").

//First Level of Recursion:
//i = 0 (c = 'p'):
//remainder = "qr"
//Calls permute("qr", "p").
//i = 1 (c = 'q'):
//remainder = "pr"
//Calls permute("pr", "q").
//i = 2 (c = 'r'):
//remainder = "pq"
//Calls permute("pq", "r").

//Second Level of Recursion:
//For permute("qr", "p"):
//i = 0 (c = 'q'):
//Calls permute("r", "pq").
//i = 1 (c = 'r'):
//Calls permute("q", "pr").
//For permute("pr", "q"):
//i = 0 (c = 'p'):
//Calls permute("r", "qp").
//i = 1 (c = 'r'):
//Calls permute("p", "qr").
//For permute("pq", "r"):
//i = 0 (c = 'p'):
//Calls permute("q", "rp").
//i = 1 (c = 'q'):
//Calls permute("p", "rq").
