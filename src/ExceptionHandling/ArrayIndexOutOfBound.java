package ExceptionHandling;
//3. Array Index Out of Bounds
//Write a program that takes an array of integers and an index from the user and prints the element at the 
//given index. If the index is out of bounds, catch the ArrayIndexOutOfBoundsException.
//Input:
//•	A list of integers and an index.
//Output:
//•	The element at the specified index or an error message if the index is invalid.

import java.util.Scanner;

public class ArrayIndexOutOfBound {
public static void main(String[] args) {
	int arr[]= {1,2,3,4};
	try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the index of element in array");
		int n=sc.nextInt();
		System.out.println("Desired element: "+arr[n]);
		}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Index is invalid "+e);
	}
}
}
