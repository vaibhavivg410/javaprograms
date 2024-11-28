package CollectionHandling;

import java.util.HashSet;

//6. Find Intersection of Two Sets
//Write a program to find the intersection of two sets of integers.
//Input:
//•	Two sets of integers.
//Output:
//•	A set that contains only the elements common to both input sets.

public class IntersectionTwoSets {
public static void main(String[] args) {
	HashSet<Integer>hs=new HashSet<>();
	hs.add(2);
	hs.add(4);
	hs.add(6);
	hs.add(8);
	
	HashSet<Integer> hs1=new HashSet<>();
	hs1.add(4);
	hs1.add(8);
	hs1.add(10);
	hs1.add(12);
	
	hs.retainAll(hs1);
	System.out.println(hs);
}
}
