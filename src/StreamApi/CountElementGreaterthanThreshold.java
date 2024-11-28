package StreamApi;
//Given a list of integers, count how many numbers are greater than a specified threshold using Stream API.
//Input:
//•	A list of integers and a threshold value.
//Output:
//•	The count of numbers greater than the threshold.

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountElementGreaterthanThreshold {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(10,15,20,25,30,35,40);
	int threshold=20;
	long count=l.stream().filter(n->n>threshold).count();
	System.out.println(count);
	
	List<Integer> li=l.stream().filter(n->n>threshold).collect(Collectors.toList());
	System.out.println(li);
}
}
