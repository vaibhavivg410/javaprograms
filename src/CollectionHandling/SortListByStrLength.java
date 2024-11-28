package CollectionHandling;
//1. Sort a List of Strings by Length
//Write a program to sort a list of strings based on their lengths, and if two strings have the same length, sort them lexicographically.
//Input:
//•	A list of strings.
//Output:
//•	A sorted list of strings first by length, then lexicographically.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListByStrLength {
public static void main(String[] args) {
	List <String> l=new ArrayList<>();
	l.add("Purva");
	l.add("Vaibhavi");
	l.add("Sneha");
	l.add("Neha");
	l.add("Aarushi");
	
	Collections.sort(l, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			int length=Integer.compare(o1.length(),o2.length());
			if(length!=0) {
				return length;
			}
			return o1.compareTo(o2);
		}
	});	
	for(String s: l) {
		System.out.println(s);
	}
}
}
