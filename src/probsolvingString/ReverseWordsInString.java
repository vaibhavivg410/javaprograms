package probsolvingString;
//7. Reverse Words in a String
//Write a function that reverses the words in a given sentence without changing the order of the words.
//•	Example:
//Input: "I love programming"
//Output: "programming love I"

public class ReverseWordsInString {
	public static String reverse(String str) {
		String [] words=str.split(" ");
		StringBuilder s=new StringBuilder();
		for(int i=words.length-1;i>=0;i--) {
			s.append(words[i]);
			if (i != 0) {
	            s.append(" "); // Add space between words
	        }
		}
		return s.toString();
		
	}
public static void main(String[] args) {
	String str="I love programming";
	ReverseWordsInString r=new ReverseWordsInString();
	System.out.println(r.reverse(str));
}
}
