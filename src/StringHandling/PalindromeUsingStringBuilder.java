package StringHandling;
//2. Check if a String is Palindrome
//Determine if a given string is a palindrome (a word, phrase, or 
//sequence that reads the same backward as forward).

import java.util.Scanner;

public class PalindromeUsingStringBuilder {
	public boolean isPalindrome(String str) {
		String reversed= new StringBuilder(str).reverse().toString();
		return str.equals(reversed);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string:");
	String str=sc.nextLine();
	
    PalindromeUsingStringBuilder p = new PalindromeUsingStringBuilder(); // Create an instance of Palindrome
    boolean result = p.isPalindrome(str); // Check if the string is a palindrome
    
    // Output the result
    if (result) {
        System.out.println(str + " is a palindrome.");
    } else {
        System.out.println(str + " is not a palindrome.");
    }
}
}
