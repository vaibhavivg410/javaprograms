package java_programs;

import java.util.Scanner;

//Java Program to Check Palindrome String
public class Ex2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	String rev="";
//	int length=s.length();
	
	for(int i=s.length()-1;i>=0;i--) {
		rev+=s.charAt(i);
	}
		if(s.equals(rev)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}
	}

}
