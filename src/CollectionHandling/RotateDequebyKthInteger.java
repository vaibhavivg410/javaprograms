package CollectionHandling;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

//9. Rotate a Deque
//Given a Deque of integers, rotate it K times to the right.
//Input:
//•	A deque of integers and an integer K.
//Output:
//•	The deque after K rotations.

public class RotateDequebyKthInteger {
public static void main(String[] args) {
	Deque <Integer> d=new ArrayDeque<>(Arrays.asList(1,3,5,2,6,4));
	int k=2;
	
	for(int i=0;i<k;i++) {
		int last=d.removeLast();
		d.addFirst(last);
			}
	System.out.println(d);
}
}
