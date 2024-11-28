package StreamApi;

import java.util.Arrays;
import java.util.List;

//Given a list of integers, use Stream API to find the maximum value.
//Input:
//•	A list of integers.
//Output:
//•	The maximum value in the list

public class MaximumValueInList {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(20,40,30,70,80);
	int max=l.stream().max(Integer::compare).orElse(null);
	System.out.println(max);
}
}
