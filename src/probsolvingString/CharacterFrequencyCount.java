package probsolvingString;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CharacterFrequencyCount {
	public static void count(String str){
		HashMap<Character, Integer> hm=new HashMap<>();
		char[] c=str.toCharArray();

		for(char i:c) {
			hm.put(i,hm.getOrDefault(i,0) +1);
			
		}
		System.out.println(hm);
		Set<Map.Entry<Character,Integer>> s=hm.entrySet();
		for(Map.Entry<Character, Integer> i: s) {
			System.out.print(i.getKey()+":");
			System.out.println(i.getValue());
		}
		
		
	}
public static void main(String[] args) {
	String str="programming";
	CharacterFrequencyCount c=new CharacterFrequencyCount();
	c.count(str);
}
}
