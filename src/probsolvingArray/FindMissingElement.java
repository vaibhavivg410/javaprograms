package probsolvingArray;
//9. Find the Missing Number in a Series
//You are given an array containing n-1 integers in the range from 1 to n. There are no duplicates in the array. One number is missing. Find the missing number.
//Example:
//•	Input: [1, 2, 4, 5]
//•	Output: 3
//Hint: Calculate the sum of integers from 1 to n and subtract the sum of the array elements.

public class FindMissingElement {
public static void main(String[] args) {
	int arr[]= {1,2,4,5};
	int n=arr.length+1;
	
	int finalSum=n*(n+1)/2;
	
	int currentSum=0;
	for(int i:arr) {
		currentSum+=i;
	}
	
	int result=finalSum-currentSum;
	System.out.println(result);
}
}
