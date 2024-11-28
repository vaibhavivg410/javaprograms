package probsolvingArray;

public class SubArrayWithMaxSumKadanesAlgo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
		int max_sum = Integer.MIN_VALUE;
		//brute force
		for(int i=0;i<arr.length;i++) {
			int sum = 0;
			for(int j=i; j< arr.length; j++) {
				sum+=arr[j];
				max_sum= Math.max(max_sum,sum);
			}
		}
		System.out.println(max_sum);


		//kendane's algorithm
		int maxSoFar = arr[0];
		int maxEndingHere = arr[0];
		for(int  i=1; i<arr.length; i++) {
			maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}
		System.out.println(maxSoFar);
	}
}
