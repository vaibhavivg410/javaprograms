package StringHandling;

import java.util.LinkedHashSet;
import java.util.Set;

//6. Remove Duplicates from a String
//Write a method to remove duplicate characters from a given string.

public class RemoveDuplicateFromString {
	public static String removeDuplicate(String str) {
		Set <Character> seen=new LinkedHashSet<>();
		for(char c:str.toCharArray()) { //converts string to char and add to hashset ensuring no duplicates
			seen.add(c);
		}
		
	    StringBuilder sb = new StringBuilder();
	    for (char c : seen) {            //appends each char from set and converts to string again
	        sb.append(c);
	    }
	    return sb.toString();
	}
	
public static void main(String[] args) {
	RemoveDuplicateFromString r= new  RemoveDuplicateFromString();
	String str="abbaacedebcd";
	String str1="banana";
	System.out.println(r.removeDuplicate(str));
	System.out.println(r.removeDuplicate(str1));
}
}
