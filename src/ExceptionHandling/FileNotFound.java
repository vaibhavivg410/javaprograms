package ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//Write a program to read data from a file. If the file is not found, handle the FileNotFoundException.
//Input:
//•	The name of the file to read.
//Output:
//•	The contents of the file, or an error message if the file is not found.

public class FileNotFound {
public static void main(String[] args) {
	try {
	File file=new File("demo.txt");
	Scanner sc=new Scanner(file);
	while(sc.hasNextLine()) {
		System.out.println(sc.nextLine());
	}
	}
	catch(FileNotFoundException e) {
		System.out.println("File not found");
	}
	
}
}
