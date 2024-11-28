package probsolvingDate;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DaysBetweenDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Prompt the user for the first date
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String firstDateString = scanner.nextLine();
        LocalDate firstDate = LocalDate.parse(firstDateString, formatter);

        // Prompt the user for the second date
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String secondDateString = scanner.nextLine();
        LocalDate secondDate = LocalDate.parse(secondDateString, formatter);

        // Calculate the number of days between the two dates
        //1
        long daysBetween = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("Number of days between " + firstDate + " and " + secondDate + ": " + daysBetween);
        
        //2
        Period between =Period.between(firstDate, secondDate);
        System.out.println("days between-"+between.getDays());
        // Close the scanner
        scanner.close();
    }
}

