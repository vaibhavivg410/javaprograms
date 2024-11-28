package ExceptionHandling;
//2. Handle Invalid Input Format
//Write a program that reads a number from the user and prints it squared. If the input is not a number, 
//catch the NumberFormatException.
//Input:
//•	A string that may or may not be a valid number.
//Output:
//•	The square of the number, or an error message if the input is invalid.

import java.util.Scanner;

public class InvalidInputFormat {
public static void main(String[] args) {
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter ");
	int n=sc.nextInt();
	System.out.println(n*n);
	}
	catch(NumberFormatException e) {
		System.out.println("Invalid Input number:Input should be an integer");
	}
}
}
