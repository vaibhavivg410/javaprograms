package StringHandling;
//1. Reverse a String
//Write a method to reverse a given string.

import java.util.Scanner;

public class ReverseString {
//	public void reverse(String str) {
//		String rev="";
//		for(int i=str.length()-1;i>=0;i--) {
//			rev+=str.charAt(i);
//		}
//		System.out.println(rev);
//		
//		
//	}
//	Using string builder
	public static String reverse1(String str) {
		return new StringBuilder(str).reverse().toString();
	}
public static void main(String[] args) {
//	ReverseString rs=new ReverseString();
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter String");
	String str=sc.nextLine();
//	rs.reverse(str);
	System.out.println("Reversed string :" +reverse1(str));
	
}
}
