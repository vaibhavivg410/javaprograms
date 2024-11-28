package StringHandling;

import java.util.Scanner;

//3. Count Vowels and Consonants
//Write a method that takes a string and counts the number of vowels and consonants.

public class CountVowelsConsonants {
	public void countVC(String str) {
		int countV=0;
		int countC=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				countV++;
			}
			else {
				countC++;
			}
			
		}
		System.out.println("Count of vowels: " +countV);
		System.out.println("Count of consonants: " +countC);
	}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string:");
	String str=sc.nextLine();
	
	CountVowelsConsonants c=new CountVowelsConsonants();
	c.countVC(str);
}
}