package ExceptionHandling;

import java.util.Scanner;

//1. Handling Division by Zero
//Write a program that takes two integers, divides the first by the second, and handles the case where the second integer is zero by throwing an ArithmeticException.
//Input:
//•	Two integers, a and b.
//Output:
//•	The result of a/b, or an error message if division by zero is attempted.

public class HandlingDivisionByZero {
	public static int division(int a,int b) throws ArithmeticException {
		if(b==0) {
			throw new ArithmeticException("Cannot divide by zero");
		}
			return a/b;
		
	}
public static void main(String[] args) {
//	try {
//		HandlingDivisionByZero h=new HandlingDivisionByZero();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter first integer:");
//		int a=sc.nextInt();
//		System.out.println("Enter second integer:");
//		int b=sc.nextInt();
//		System.out.println("Result:"+h.division(a, b));
//	}
//	catch(ArithmeticException e){
//		System.out.println(e);
//	}
	
	HandlingDivisionByZero h=new HandlingDivisionByZero();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first integer:");
	int a=sc.nextInt();
	System.out.println("Enter second integer:");
	int b=sc.nextInt();
	System.out.println("Result:"+h.division(a, b));
	

}
}
