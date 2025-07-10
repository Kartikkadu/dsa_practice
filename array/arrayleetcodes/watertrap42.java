package arrayleetcodes;

import java.util.Scanner;

import arraybase.max;

public class watertrap42 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		int x = a.nextInt();
		
		int[] arr = new int[x];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = a.nextInt();
			
			System.out.println(trapping(arr));
			

		}
	}

	public static int trapping(int[] arr) {

		int x = arr.length;
		
		int[] left = new int[x];
		
		left[0] = arr[0];
		
		for (int i = 1; i < x; i++) 
		{
			
			left[i] = Math.max(left[i - 1], arr[i]);
			

		}
		int[] right = new int[x];
		
		right[x - 1] = arr[x - 1];
		
		for (int i = x - 2; i >= 0; i--)
		{
			
			right[i] = Math.max(right[i + 1], arr[i]);
			
		}
		
		int sum = 0;
		
		for (int i = 0; i < x; i++)
		{
			
			sum = sum + Math.min(left[i], right[i]) - arr[i];
		}
		
		return sum;

	}

}