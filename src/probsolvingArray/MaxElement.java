package probsolvingArray;

//2. Find the Maximum Element
//Write a function that finds the maximum value in a given array of integers.
//Example:
//•	Input: [5, 2, 8, 1, 9]
//•	Output: 9
//Hint: Use a loop to compare each element to a max variable.


public class MaxElement {
//	public static int max(int arr[]){
//		int max=arr[0];
//	for(int i=1;i<arr.length;i++) {
//		
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//	return max;
//	}
	
public static int min(int arr[]) {
	int min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i]<min) {
			min=arr[i];
		}
	}
	return min;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,2,8,1,9};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			
				if(arr[i]>max) {
					max=arr[i];
				}
			}
		System.out.println("Maximum element is:"+max);

//		int result=max(arr);
//		System.out.println("Maximum element is:"+result);
		int result=min(arr);
		System.out.println("Minimum element is:"+result);
	}

}
