package CollectionHandling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//10. Group Anagrams
//Given an array of strings, group anagrams together.
//Input:
//•	A list of strings.
//Output:
//•	A list of lists where each list contains strings that are anagrams.

public class GroupAnagrams {
public static void main(String[] args) {
	List<String> l=Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
	
    Map<String, List<String>> anagramMap = new HashMap<>();
    
    for (String str : l) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        anagramMap.computeIfAbsent(sorted, k -> new ArrayList<>()).add(str);
    }
    
    System.out.println(new ArrayList<>(anagramMap.values()));

}
}


//Processing "eat":
//Sort characters: eat → aet
//Update anagramMap: { "aet" : ["eat"] }

//Processing "tea":
//Sort characters: tea → aet
//Update anagramMap: { "aet" : ["eat", "tea"] }

//Processing "tan":
//Sort characters: tan → ant
//Update anagramMap: { "aet" : ["eat", "tea"], "ant" : ["tan"] }