package StreamApi;
//5. Find First Element Matching Condition
//Given a list of integers, find the first element greater than a specified value using Stream API.
//Input:
//•	A list of integers and a value.
//Output:
//•	The first number greater than the specified value or a message if none is found.

import java.util.Arrays;
import java.util.List;

public class FindFirstElementMatchingCondition {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(10,15,20,25,30,35,40);
	int value=25;
	l.stream().filter(n->n>value).findFirst().ifPresentOrElse(System.out::println,()->System.out.println("element not found"));
//	System.out.println(first);
}
}
