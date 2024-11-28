package CollectionHandling;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//8. Find Kth Largest Element in a List
//Given a list of integers, find the Kth largest element in the list.
//Input:
//•	A list of integers and an integer K.
//Output:
//•	The Kth largest element in the list.

public class KthLargestElement {
	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(2,3,7,10,23,5);
		int k=2;
		Collections.sort(l,Collections.reverseOrder()); //23 10 7 5 3 2
		System.out.println(l.get(k-1));
	}
}
