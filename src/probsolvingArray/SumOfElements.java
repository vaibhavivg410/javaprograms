package probsolvingArray;

//1. Sum of Elements in an Array
//Write a function that takes an array of integers and returns the sum of its elements.
//Example:
//•	Input: [1, 2, 3, 4, 5]
//•	Output: 15
//Hint: Iterate through the array and add each element to a sum variable.

public class SumOfElements {
public static void main(String[] args) {
	int [] arr= {1,2,3,4,5};
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		
		sum=sum+arr[i];
//		break;
		
	}
	System.out.println("Sum of elements:"+sum);
}
}
