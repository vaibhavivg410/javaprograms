package probsolvingArray;
//5. Find the Second Largest Element
//Write a function that finds the second largest element in an array of integers.
//Example:
//•	Input: [1, 4, 2, 7, 5]
//•	Output: 5
//Hint: Traverse the array while keeping track of the largest and second-largest values.

public class SecondLargestElement {
public static void main(String[] args) {
//	int arr[]= {1,4,2,7,5};
	int arr[]= {5,2,8,1,9};
	int max=arr[0];
	
	for(int i=1;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i]-arr[i-1];
			
		}
	}
	System.out.println(max);
}
}
