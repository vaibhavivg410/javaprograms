package probsolvingDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
//9. Schedule Event at Fixed Interval
//Write a program that simulates scheduling an event at a fixed interval, for example, every second Monday of the month at 10 AM for the next 6 months. Print the dates and times of the events.
//Hint: Use TemporalAdjusters to find the second Monday of the month and LocalTime.of() to set the time.

public class ScheduleEventAtFixedInterval {
    public static void main(String[] args) {
        // Start from the current date
        LocalDate startDate = LocalDate.now();

        // Define the formatter for the output
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

        System.out.println("Scheduled Events (Every Second Monday at 10 AM):");

        // Schedule events for the next 6 months
        for (int i = 0; i < 6; i++) {
            // Get the month to schedule for
            LocalDate eventMonth = startDate.plusMonths(i);

            // Find the second Monday of the month
            LocalDate secondMonday = eventMonth.with(TemporalAdjusters.dayOfWeekInMonth(2, java.time.DayOfWeek.MONDAY));

            // Set the time to 10 AM
            LocalDateTime eventDateTime = secondMonday.atTime(LocalTime.of(10, 0));

            // Print the scheduled event date and time
            System.out.println(eventDateTime.format(formatter));
        }
    }
}
