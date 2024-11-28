package probsolvingDate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CalculateDurationBetweenTwoTimeInstants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        // Prompt the user for the first LocalDateTime
        System.out.print("Enter the first date and time (yyyy-MM-dd'T'HH:mm): ");
        String firstDateTimeString = scanner.nextLine();
        LocalDateTime firstDateTime = LocalDateTime.parse(firstDateTimeString, formatter);

        // Prompt the user for the second LocalDateTime
        System.out.print("Enter the second date and time (yyyy-MM-dd'T'HH:mm): ");
        String secondDateTimeString = scanner.nextLine();
        LocalDateTime secondDateTime = LocalDateTime.parse(secondDateTimeString, formatter);

        // Calculate the duration between the two LocalDateTime objects
        Duration duration = Duration.between(firstDateTime, secondDateTime);

        // Get hours, minutes, and seconds from the duration
        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60; // remainder after converting to hours
        long seconds = duration.getSeconds() % 60; // remainder after converting to minutes

        // Output the duration
        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

        // Close the scanner
        scanner.close();
    }
}
