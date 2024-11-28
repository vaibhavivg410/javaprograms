package StringHandling;

import java.util.Arrays;

public class TwoStringAnagramsCheck {
	public static boolean anagramCheck(String str1,String str2){
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		return Arrays.equals(arr1, arr2);
	}	
public static void main(String[] args) {
	String str1="eat";
	String str2="ate";
	TwoStringAnagramsCheck t=new TwoStringAnagramsCheck();
	boolean result=t.anagramCheck(str1, str2);
	System.out.println(result);
	
	
}
}
