package probsolvingArray;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		int n = arr.length/2;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num : arr) {
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		for(Map.Entry<Integer, Integer> e : map.entrySet()) {
			if(e.getValue() > n)
			{
				System.out.println(e.getKey());
			}
		}
	}
 
}
