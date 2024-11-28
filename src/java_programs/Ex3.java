package java_programs;
//Java Program to Find Duplicate Characters in a String
public class Ex3 {
public static void main(String[] args) {
	String str="abcshhekac";
	char[] ch=str.toCharArray(); // converts string to array for easy comparison
	int length=ch.length;
	
	System.out.println("Given String: "+str);
	
	for(int i=0;i<length-1;i++) {
		
		for(int j=i+1;j<length;j++) { //starts comparing with i from the second character of string
			if(ch[i]==ch[j]) {
				System.out.println(ch[i] +" ");
				break;
			}
		}
		
		}
	}
		
		
}

