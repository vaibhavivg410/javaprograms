package StreamApi;
//8. Group Strings by Length
//Given a list of strings, group them by their length using Stream API.
//Input:
//•	A list of strings.
//Output:
//•	A map where the key is the string length and the value is a list of strings of that length.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
public static void main(String[] args) {
	List<String> l=Arrays.asList("Vaibhavi","Aarushi","Purva","Neha","Sneha");
	Map<Integer, List<String>> length=l.stream().collect(Collectors.groupingBy(String::length));
	System.out.println(length);
}
}
