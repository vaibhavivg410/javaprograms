package probsolvingDate;
import java.time.Year;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for a year
        System.out.print("Enter a year: ");
        int yearInput = scanner.nextInt();

        // Check if the year is a leap year
        boolean isLeap = Year.isLeap(yearInput);

        // Output the result
        System.out.println(yearInput + " is a leap year: " + isLeap);

        // Close the scanner
        scanner.close();
    }
}
