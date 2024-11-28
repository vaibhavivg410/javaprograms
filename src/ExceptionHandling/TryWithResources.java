package ExceptionHandling;
//Write a program to demonstrate exception handling using try-with-resources to automatically close resources.
//Input:
//•	No specific input required.
//Output:
//•	A message indicating that resources have been closed.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
