package StreamApi;
//6. Concatenate Strings with Delimiter
//Given a list of strings, concatenate them into a single string with a delimiter using Stream API.
//Input:
//•	A list of strings and a delimiter.
//Output:
//•	A single string with the elements concatenated by the delimiter.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStringsWithDelimiter {
public static void main(String[] args) {
	List<String> l=Arrays.asList("abc","pqr","xyz");
	String delimiter=",";
	String result=l.stream().collect(Collectors.joining(delimiter));
	System.out.println(result);
}
}
