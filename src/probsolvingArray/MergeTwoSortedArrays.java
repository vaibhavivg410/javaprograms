package probsolvingArray;

//Write a function that merges two sorted arrays into a single sorted array.
//Example:
//•	Input: [1, 3, 5] and [2, 4, 6]
//•	Output: [1, 2, 3, 4, 5, 6]
//Hint: Use two pointers to traverse both arrays and add smaller elements to the result.
//________________________________________

public class MergeTwoSortedArrays {
	 
	public static int[] mergeSortedArrays(int[] arr, int[] arr1) {
	        int n1 = arr.length;
	        int n2 = arr1.length;
	        int[] merged = new int[n1 + n2];
	        int i = 0, j = 0, k = 0;

	        while (i < n1 && j < n2) {
	            if (arr[i] < arr1[j]) {
	                merged[k++] = arr[i++];
	            } else {
	                merged[k++] = arr1[j++];
	            }
	        }

	        //to copy remaining elements of arr1
	        while (i < n1) {
	            merged[k++] = arr[i++];
	        }

	        //to copy remaining elements of arr2
	        while (j < n2) {
	            merged[k++] = arr1[j++];
	        }

	        return merged;
	    }
	

    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int[] arr1 = {2, 4, 6};
        int[] result = mergeSortedArrays(arr, arr1);
        
        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

   
