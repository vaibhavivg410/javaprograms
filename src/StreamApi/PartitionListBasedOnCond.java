package StreamApi;
//10. Partition a List of Strings Based on Condition
//Given a list of strings, partition the strings into two groups based on whether their length is greater than 3 using Stream API.
//Input:
//•	A list of strings.
//Output:
//•	A map with two entries: one containing strings with length greater than 3 and one containing strings with length 3 or less.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionListBasedOnCond {
public static void main(String[] args) {
	List<String> l=Arrays.asList("abc","pr","xy","Vaibhavi","Neha","Sneha","Purva");
	Map<Boolean,List<String>> partition=l.stream().collect(Collectors.partitioningBy(s->s.length()>3));
	System.out.println(partition);
}
}
