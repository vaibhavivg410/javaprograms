package java_programs;
import java.util.*;
//Java Program to Find the First Non-repeated Character in a String
public class FirstNonRepeatedChar {
	public static void main(String[] args) {
		String str="abcshhekaac";
		int length=str.length();
		
		System.out.println("Given String: "+str);
//Outer Loop:iterates over each character of the string 
//unique is set to true for each character to track whether it is non-repeated.
		for(int i=0;i<length-1;i++) {
			boolean unique =true; 
//compares the current character (indexed by i)with all other characters in the string (indexed by j).			
			for(int j=0;j<length-1;j++) {
				if(i!=j && str.charAt(i)==str.charAt(j)) {
					unique=false;
					break;
				}
				
			}
			if(unique) {
				System.out.println("The First Non-repeated Character in a String is : "+str.charAt(i));
				break;
			}
		}
	}
	
}
