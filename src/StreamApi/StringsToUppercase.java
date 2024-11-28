package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringsToUppercase {
public static void main(String[] args) {
	List<String> l=Arrays.asList("abc","pqr","xyz");
	List<String> upperCase=l.stream().map(String::toUpperCase).collect(Collectors.toList());
	System.out.println(upperCase);
	upperCase.stream().forEach(System.out::println);
	
}
}
