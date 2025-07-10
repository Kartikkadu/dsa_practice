package arrayleetcodes;

import java.util.Arrays;

public class Q1365_smallerNumbersThanCurrent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,1,2,2,3};
		ans(arr);

	}

	private static void ans(int[] arr) {
		// TODO Auto-generated method stub
		int[] temp= Arrays.copyOf(arr, arr.length);
		Arrays.sort(temp);
		int i=0;
		int j=1;
		while (i<arr.length) {
			if (i==arr.length-1) {
				 arr[i]=j;
				 
			}
			if (temp[i]<temp[i+1]) {
				arr[i]=j;
				i++;
				j++;
				
			} else {
				i++;

			}
			}
		
		for (int j2 = 0; j2 < temp.length; j2++) {
			System.out.print(temp[j2]+" ");
		}

	}

}
