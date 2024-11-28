package CollectionHandling;
//4. Remove Duplicates from a List
//Write a program to remove duplicates from a list while preserving the original order of the elements.
//Input:
//•	A list of integers.
//Output:
//•	A list with duplicates removed.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromList {
public static void main(String[] args) {
	List<Integer> l=Arrays.asList(1,2,3,5,2,1,5,3);
	HashSet<Integer> hs=new HashSet<>(l);
	System.out.println(hs);

	
}
}
