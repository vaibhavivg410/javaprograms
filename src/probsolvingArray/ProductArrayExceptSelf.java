package probsolvingArray;

import java.util.Arrays;

public class ProductArrayExceptSelf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1, 2, 3, 4};
//		int [] temp =new int [arr.length];
//		for(int i=0; i<arr.length; i++) {
//			int result=1;
//			for(int j=0; j<arr.length;j++) {
//				if(j!=i) {
//					result= result* arr[j];
//				}
//			}
//			temp[i]=result;
//		}
//		for(int i = 0; i<temp.length; i++) {
//			System.out.print(temp[i] +" ");
//		}
		// another way
		int n = arr.length;
		int [] result = new int[n];
		Arrays.fill(result, 1);
		int prefixProduct =1;
		for(int i=0; i<n; i++) {
			result[i]=prefixProduct;
			prefixProduct *= arr[i];
		}
		int suffixProduct =1;
		for(int i=n-1; i>=0; i--) {
			result[i] *= suffixProduct;
			suffixProduct *= arr[i];
		}
		for(int i=0; i<n; i++) {
			System.out.print(result[i]+ " ");
		}
	}
 
}
