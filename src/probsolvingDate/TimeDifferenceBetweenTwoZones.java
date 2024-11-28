package probsolvingDate;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

//3. Time Difference Between Two Time Zones
//Write a program to calculate the time difference between two cities. The program should prompt 
//the user to input the city names (e.g., "Asia/Kolkata" and "Europe/London") and calculate the time difference in hours.
//Hint: Use ZoneId and ZonedDateTime to get the current time for each city and find the difference 
//using Duration.between().

public class TimeDifferenceBetweenTwoZones {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter city name1:");
	String city1=sc.nextLine();
	System.out.println("Enter city name2:");
	String city2=sc.nextLine();
	
	try {
        // Get the current time in the first city
        ZonedDateTime timeInFirstCity = ZonedDateTime.now(ZoneId.of(city1));
        System.out.println("Current time in "+city1 +" City:"+timeInFirstCity);

        // Get the current time in the second city
        ZonedDateTime timeInSecondCity = ZonedDateTime.now(ZoneId.of(city2));
        System.out.println("Current time in "+city2 +" City:"+timeInSecondCity);
        
        //1. Calculate the offset difference in hours
      //  long hoursDifference = timeInFirstCity.getOffset().getTotalSeconds() / 3600 - timeInSecondCity.getOffset().getTotalSeconds() / 3600;
        // Output the time difference in hours
        // System.out.println("Time difference between " + city1 + " and " + city2 + " is: " + hoursDifference + " hours.");
         
        //2. Calculate the offset difference in hours
        long totalSecondsDifference = (timeInFirstCity.getOffset().getTotalSeconds() - timeInSecondCity.getOffset().getTotalSeconds());
        long hoursDifference = totalSecondsDifference / 3600;
        long minutesDifference = (totalSecondsDifference % 3600) / 60;
               
     // Output the time difference in hours and minutes
        System.out.println("Time difference between " + city1 + " and " + city2 + " is: " + hoursDifference + " hours and " + Math.abs(minutesDifference) + " minutes.");
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    } finally {
        // Close the scanner
        sc.close();
    }
	
	
}
}
