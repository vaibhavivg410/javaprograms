package probsolvingArray;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//7. Find the Frequency of Elements
//Write a function that counts the frequency of each element in an array.
//Example:
//•	Input: [2, 3, 2, 1, 4, 2]
//•	Output: {2: 3, 3: 1, 1: 1, 4: 1}
//Hint: Use a HashMap to store each element and its frequency.

public class FrequencyOfElementsHashMap {
public static void main(String[] args) {
	int [] arr= {2, 3, 2, 1, 4, 2};
	HashMap<Integer,Integer> hm=new HashMap<>();
	
	for(int i:arr) {
		hm.put(i, hm.getOrDefault(i,0)+1);
	}
	System.out.println(hm);
	
	Set< Map.Entry<Integer,Integer>> sh =hm.entrySet();  // prints keys and its values
	for(Map.Entry<Integer, Integer>i:sh) {
		System.out.print(i.getKey()+ ":");
		System.out.println(i.getValue());
	}
}
}
