package probsolvingDate;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateTimeFormatter {
    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Define the desired date-time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the current date and time
        String formattedDateTime = currentDateTime.format(formatter);

        // Output the formatted date and time
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}
