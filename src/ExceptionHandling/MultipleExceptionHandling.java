package ExceptionHandling;
//5. Multiple Exception Handling
//Write a program that divides two numbers and handles both ArithmeticException and InputMismatchException.

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(a/b);
		}
		catch(ArithmeticException e){
			
			System.out.println("Cannot divide by zero :"+e);
		}
		catch(InputMismatchException e1) {
			System.out.println("Enter valid input: "+e1.getMessage());
		}

	}

}
