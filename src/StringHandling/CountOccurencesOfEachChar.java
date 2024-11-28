package StringHandling;

import java.util.HashMap;
import java.util.Map;

public class CountOccurencesOfEachChar {
	public static void count(String str) {
		Map<Character, Integer> m=new HashMap<>();
		for(char c:str.toCharArray()) {
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer>entry:m.entrySet()) {
			System.out.println(entry.getKey()+": " +entry.getValue());
		}
	}
public static void main(String[] args) {
	String str="absgbsaagis";
	CountOccurencesOfEachChar o=new CountOccurencesOfEachChar();
	o.count(str);
}
}
