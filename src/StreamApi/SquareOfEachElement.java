package StreamApi;
//7. Square of Each Element in a List
//Given a list of integers, return a list containing the square of each element using Stream API.
//Input:
//•	A list of integers.
//Output:
//•	A list of the squares of the integers.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEachElement {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,4,5);
	List<Integer> square=l.stream().map(n->n*2).collect(Collectors.toList());
	System.out.println(square);
}
}
