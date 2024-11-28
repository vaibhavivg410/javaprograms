package probsolvingArray;

//3. Reverse an Array
//Write a function that reverses the elements of an array.
//Example:
//•	Input: [1, 2, 3, 4, 5]
//•	Output: [5, 4, 3, 2, 1]
//Hint: Swap elements from the start and end of the array, moving toward the center.

public class ReverseArray {
public static void main(String[] args) {
	int []arr= {1, 2, 3, 4, 5};
	int start=0;
	int end=arr.length-1;
	while(start<end){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		
		start++;
		end--;
	}
	for(int r:arr) {
		System.out.println(r);
	}
}
}
