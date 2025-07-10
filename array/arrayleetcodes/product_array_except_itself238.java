package arrayleetcodes;

import java.util.Scanner;

public class product_array_except_itself238 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt();
		}
			
			int y=arr.length;
			int[] left = new int[y];
			left[0]=1;
			for (int i = 1; i < y; i++) {
				left[i]=left[i-1]*arr[i-1];
			}
			int[]  right=new int[y];
			right[y-1]=1;
			for (int i = y-2; i >= 0; i--) {
				right[i]=right[i+1]*arr[i+1];		
			}
			int[] answer = new int[y];
			for (int i = 0; i < y; i++) {
				answer[i]=left[i]*right[i];
				
			}

			for (int i = 0; i < answer.length; i++) {
				System.out.print(answer[i]+" ");
				
			};
			
	}

	

}