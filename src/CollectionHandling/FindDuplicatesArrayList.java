package CollectionHandling;
import java.util.ArrayList;
import java.util.HashSet;

//2. Find Duplicates in an ArrayList
//Given an ArrayList of integers, find and print the duplicates.
//Input:
//•	A list of integers.
//Output:
//•	The duplicate elements from the list.

public class FindDuplicatesArrayList {
public static void main(String[] args) {
	ArrayList <Integer> al=new ArrayList<>();
	al.add(5);
	al.add(4);
	al.add(1);
	al.add(1);
	al.add(6);
	//track unique numbers as we iterate through the list.
	HashSet<Integer> hs=new HashSet<>();
	//store numbers that are found to be duplicates.
	HashSet<Integer> duplicate=new HashSet<>();
	
	for(int num:al) {
	if(!hs.add(num)) { //hs add the current number num.
//If the number was already in the HashSet, add() returns false (indicating it was a duplicate).
//If it returns false, the number is then added to the duplicate HashSet.
		duplicate.add(num); 
	}
	}
	System.out.println(duplicate);
}
}