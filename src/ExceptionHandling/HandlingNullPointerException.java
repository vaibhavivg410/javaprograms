package ExceptionHandling;

import java.util.Scanner;

//7. Handling NullPointerException
//Write a program that tries to access a method on a null object and handles the NullPointerException.
//Input:
//•	No specific input required.
//Output:
//•	A message indicating the null reference error.

public class HandlingNullPointerException {
	public static String checkNull(String str) throws NullPointerException{
		if(str.isEmpty()) {
			throw new NullPointerException("Empty string is not allowed");
		}
		return str;
	}
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string:");
    String str = sc.nextLine();
    String result =checkNull(str);
    System.out.println(str);
    
//    String str=null;
//    try {
//    	if(str.isEmpty()) {
//    		System.out.println("Error: Null reference encountered.");
//    	}
//    	else {
//        System.out.println(str.length());
//    	}
//    } catch(NullPointerException e) {
//    	
//        System.out.println(e);
//    }

}
}
