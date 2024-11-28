package StringHandling;
//9. Check if a String Contains Only Digits
//Write a method that checks if a string contains only digits.

public class CheckStringContainsOnlyDigits {
	public boolean checkString(String str) {
		return str.matches("\\d+");
	}
public static void main(String[] args) {
	CheckStringContainsOnlyDigits c=new CheckStringContainsOnlyDigits();
	String str ="3239";
	boolean result=c.checkString(str);
	System.out.println(result);
}
}
