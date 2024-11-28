package ExceptionHandling;
//6. Custom Exception for Age Validation
//Create a custom exception class InvalidAgeException that is thrown when the user tries to enter an age less 
//than 18 or greater than 100.
//Input:
//•	An age input from the user.
//Output:
//•	A message that validates the age or throws a custom exception.

import java.util.Scanner;

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
public class CustomExceptionAgeValidation {
public static void main(String[] args) {
	try {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter age:");
	int age=sc.nextInt();
	if(age<18 || age>100) {
		throw new InvalidAgeException("Age should be less than 18 or greater than 100");
	}
	System.out.println("Age: "+age);
	}
	catch(InvalidAgeException e){
		System.out.println(e);
	}
}
}
