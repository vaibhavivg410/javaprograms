package probsolvingArray;
//4. Rotate an Array by K Positions
//Write a function that rotates an array by k positions to the right. If k = 3, the last 3 elements of the array move to the beginning.
//Example:
//•	Input: [1, 2, 3, 4, 5], k = 2
//•	Output: [4, 5, 1, 2, 3]
//Hint: Use a combination of array slicing and concatenation or handle rotation in-place using modular arithmetic.
public class RotateArrayByKPositions {

    // Method to rotate an array by k positions
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        
        // Handle the case where k is greater than the length of the array
        k = k % n;  // In case k is larger than n, only need to rotate k % n times
        
        if (k == 0) {
            return arr;  // No rotation needed if k is 0
        }
        
        // Create a new array to store the result
        int[] rotatedArray = new int[n];
        
        // Copy the last k elements to the front
        for (int i = 0; i < k; i++) {
            rotatedArray[i] = arr[n - k + i];
        }
        
        // Copy the first n-k elements to the remaining positions
        for (int i = 0; i < n - k; i++) {
            rotatedArray[k + i] = arr[i];
        }
        
        return rotatedArray;
    }

    // Main method to test the rotation
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        
        // Rotate the array by k positions
        int[] rotatedArr = rotateArray(arr, k);
        
        // Print the rotated array
        System.out.print("Rotated Array: ");
        for (int num : rotatedArr) {
            System.out.print(num + " ");
        }
        // Expected Output: Rotated Array: 4 5 1 2 3
    }
}
