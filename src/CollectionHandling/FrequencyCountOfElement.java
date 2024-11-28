 package CollectionHandling;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//3. Frequency Count of Each Element
//Given a list of integers, count the frequency of each element in the list and print it.
//Input:
//•	A list of integers.
//Output:
//•	A frequency count of each element.

public class FrequencyCountOfElement {
public static void main(String[] args) {
	int [] arr= {1,2,3,1,2,3,3};
	HashMap<Integer,Integer> hm=new HashMap<>();
	
	for(int i:arr) {
		hm.put(i,hm.getOrDefault(i,0) +1);
		
	}
	System.out.println(hm);
	Set<Map.Entry<Integer,Integer>> s=hm.entrySet();
	for(Map.Entry<Integer, Integer> i: s) {
		System.out.print(i.getKey()+":");
		System.out.println(i.getValue());
	}
	
	for (Integer key1 : hm.keySet()) {
        System.out.println(key1 + ": " + hm.get(key1));
    }
	
	//For String
	String [] arr1= {"Apple","Mango","Apple","Kiwi","Kiwi","Orange","Apple"};
	HashMap<String,Integer> hm1=new HashMap<>();
	
	for(String i:arr1) {
		hm1.put(i,hm1.getOrDefault(i,0) +1);
		
	}
	System.out.println("======1st=======");
	System.out.println(hm1);
	
	System.out.println("========2nd======");
	Set<Map.Entry<String,Integer>> s1=hm1.entrySet();
	for(Map.Entry<String, Integer> i: s1) {
		System.out.print(i.getKey()+":");
		System.out.println(i.getValue());
	}
	System.out.println("========3rd=======");
		for (String key : hm1.keySet()) {
            System.out.println(key + ": " + hm1.get(key));
        }
	}
}

