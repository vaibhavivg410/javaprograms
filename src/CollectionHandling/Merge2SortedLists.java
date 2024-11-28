package CollectionHandling;
//5. Merge Two Sorted Lists
//You are given two sorted lists. Write a program to merge them into a single sorted list.
//Input:
//•	Two sorted lists of integers.
//Output:
//•	A single merged sorted list.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Merge2SortedLists {
public static void main(String[] args) {
	List<Integer> l1=Arrays.asList(1,2,3,4);
	List<Integer> l2=Arrays.asList(5,6,7,8);
	
	List<Integer> merged=new ArrayList<>(l1);
	
	merged.addAll(l2);
	System.out.println(merged);
}
}
