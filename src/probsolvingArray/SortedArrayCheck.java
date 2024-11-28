package probsolvingArray;

//6. Check if Array is Sorted
//Write a function that checks if an array is sorted in ascending order.
//Example:
//•	Input: [1, 2, 3, 4, 5]
//•	Output: true
//Input: [1, 3, 2, 4, 5]
//•	Output: false
//Hint: Compare each element with the next one to see if they are in increasing order.

public class SortedArrayCheck {
public static boolean isSorted(int arr[]){
	for(int i=1;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			return false;
		}
	}
	return true;
}
	
public static void main(String[] args) {
	int arr[]= {1,2,3,4,5};
	boolean result=isSorted(arr);
	System.out.println(result);
}
}
