package probsolvingDate;
//2. Find Day of the Week for a Given Date
//Write a program that prompts the user to input a date in the format yyyy-MM-dd and outputs the day of the week for that date.
//Example:
//•	Input: 2023-10-08
//•	Output: Sunday
//Hint: Use LocalDate.getDayOfWeek() to get the day.

import java.time.LocalDate;
import java.util.Scanner;

public class DayOfWeekForGivenDate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter date in format(yyyy-MM-dd):");
	String input =sc.nextLine();
	
	LocalDate date= LocalDate.parse(input);
	System.out.println(date.getDayOfWeek());
	
	

}
}
