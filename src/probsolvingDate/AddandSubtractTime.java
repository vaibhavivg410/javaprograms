package probsolvingDate;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

//4. Add and Subtract Time
//Write a Java program that takes a date and time as input and adds or subtracts a given number of days, months, and hours. Use LocalDateTime for the operations.
//Example:
//•	Input: 2024-01-01T10:00, days to add: 5, months to subtract: 1, hours to add: 12
//•	Output: 2023-12-06T22:00
//Hint: Use plusDays(), minusMonths(), and plusHours() methods from LocalDateTime

public class AddandSubtractTime {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	  
    // Define the date format
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm");
   
    // Get input for the date and time
    System.out.println("Enter the date and time (format: yyyy-MM-dd'T'HH:mm):");
    String dateTimeInput = scanner.nextLine();

    // Get input for days, months, and hours to add/subtract
    System.out.print("Days to add (positive) or subtract (negative): ");
    int days = scanner.nextInt();
    System.out.print("Months to subtract (positive): ");
    int months = scanner.nextInt();
    System.out.print("Hours to add (positive) or subtract (negative): ");
    int hours = scanner.nextInt();

    try {
        // Parse the input date and time
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeInput, formatter);

        // Add/subtract the specified time
        LocalDateTime updatedDateTime = dateTime.plusDays(days).minusMonths(months).plusHours(hours);

        // Output the result
        System.out.println("Updated date and time: " + updatedDateTime.format(formatter));
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        // Close the scanner
        scanner.close();
    }
}
	

}
