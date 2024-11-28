package StreamApi;
//9. Remove Duplicates and Sort a List
//Given a list of integers, use Stream API to remove duplicates and return the list sorted.
//Input:
//•	A list of integers.
//Output:
//•	A sorted list with duplicates removed.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesSortList {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,2,1,4,5,4);
	List<Integer> sort=l.stream().distinct().sorted().collect(Collectors.toList());
	System.out.println(sort);
}
}
