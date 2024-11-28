package StreamApi;
//1. Sum of Even Numbers
//Given a list of integers, use Stream API to find the sum of all even numbers.
//Input:
//•	A list of integers.
//Output:
//•	The sum of all even numbers.

import java.util.Arrays;
import java.util.List;

public class EvenNumSum {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	int sum=l.stream().filter(n->n%2==0).mapToInt(Integer::intValue ).sum();
	System.out.println("Sum of even numbers: "+sum);
}
}
