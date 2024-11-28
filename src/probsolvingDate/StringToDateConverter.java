package probsolvingDate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

//8. Convert String to Date and Back to String in Different Format
//Write a program that takes a date string in the format yyyy/MM/dd and converts it into the format dd-MM-yyyy.
//Example:
//•	Input: 2024/01/01
//•	Output: 01-01-2024
//Hint: Use DateTimeFormatter to parse and format the date string.

public class StringToDateConverter {
    public static void main(String[] args) {
        // Input date string in the format yyyy/MM/dd
        String inputDateString = "2024/01/01";

        try {
            // Define the input and output date formats
            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
            DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

            // Parse the input date string to LocalDate
            LocalDate date = LocalDate.parse(inputDateString, inputFormatter);

            // Format the LocalDate back to the desired string format
            String outputDateString = date.format(outputFormatter);

            // Output the formatted date string
            System.out.println("Converted Date: " + outputDateString);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use yyyy/MM/dd.");
        }
    }
}
