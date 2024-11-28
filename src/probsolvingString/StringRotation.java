package probsolvingString;
//Check if one string is a rotation of another string.
//•	Example:
//Input: "waterbottle", "erbottlewat"
//Output: true

public class StringRotation {
	public boolean rotation(String str1,String str2) {
		  if (str1.length() != str2.length() || str1.isEmpty()) {
	            return false;
	        }
		String concat=str1+str2;
		return concat.contains(str2);
	}
public static void main(String[] args) {
	StringRotation s=new StringRotation();
	String str1="waterbottle";
	String str2="eltobtretaw";
	System.out.println(s.rotation(str1, str2));
}
}
