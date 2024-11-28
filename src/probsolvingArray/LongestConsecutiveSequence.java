package probsolvingArray;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {100, 4, 200, 1, 3, 2};
		HashSet <Integer> set= new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			set.add(arr[i]);
		}
		int maxLength=0;
		for(int num : set) {
			if(!set.contains(num-1)) {
				int currNum = num;
				int currLen = 1;
				//count all the consecutive numbers
				while(set.contains(currNum+1)) {
					currNum++;
					currLen++;
				}
				//update the max length
				maxLength = Math.max(maxLength, currLen);
			}
		}
		System.out.println(maxLength);
	}
 

}
