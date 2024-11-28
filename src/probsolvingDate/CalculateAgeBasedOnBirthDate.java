package probsolvingDate;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;

//1. Calculate the Age Based on Birthdate
//Write a Java program that takes a birthdate as input in the format yyyy-MM-dd and calculates the current age of the person using the LocalDate class.
//Example:
//•	Input: 1990-06-15
//•	Output: 34 (assuming current year is 2024)
//Hint: Use Period.between() method to find the difference in years between the birthdate and the current date.


public class CalculateAgeBasedOnBirthDate {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);

    // Prompt the user for their birthdate
    System.out.print("Enter your birthdate (yyyy-MM-dd): ");
    String inputDate = scanner.nextLine();

    // Parse the input string to a LocalDate
    LocalDate birthDate = LocalDate.parse(inputDate);

    // Get the current date
    LocalDate currentDate = LocalDate.now();

    // Calculate the age using Period.between()
    Period age = Period.between(birthDate, currentDate);

    // Output the age in years
    System.out.println("Your age is: " + age.getYears());

    // Close the scanner
    scanner.close();
}
}

