package probsolvingArray;

import java.util.HashSet;

//11. Find the Common Elements in Two Arrays
//Write a function to find the common elements between two arrays.
//Example:
//•	Input: [1, 2, 3, 4] and [3, 4, 5, 6]
//•	Output: [3, 4]
//Hint: Use a HashSet to store elements from one array and check against the other array.

public class CommonElementsTwoArrayHashSet {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int arr1[] = {3, 4, 5, 6};

        HashSet<Integer> hs = new HashSet<>();
        
        // Store elements of the first array in the HashSet
        for (int num : arr) {
            hs.add(num);
        }
        
        // Check for common elements in the second array
        HashSet<Integer> commonElements = new HashSet<>();
        for (int num : arr1) {
            if (hs.contains(num)) {
                commonElements.add(num);
            }
        }
        // Output the common elements
        for (int k : commonElements) {
            System.out.print(k + " ");
        }
    }
}
