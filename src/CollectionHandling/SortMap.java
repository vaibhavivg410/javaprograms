package CollectionHandling;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class SortMap {
 
	public static void main(String[] args) {
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("apple", 3);
		map.put("mango", 1);
		map.put("pineapple", 2);
		List<Map.Entry<String,Integer>> l=new ArrayList<>(map.entrySet());
        l.sort(Map.Entry.comparingByKey());
        for (Map.Entry<String, Integer> entry : l) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
 	}
        System.out.println("=======================");
        l.sort(Map.Entry.comparingByValue());
        for (Map.Entry<String, Integer> entry : l) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
	}
}
}