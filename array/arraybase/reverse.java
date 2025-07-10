package arraybase;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt();
			
		}
		reverse(arr);
		
		

	}
	public static void reverse(int[]arr) {
		int y=arr.length-1;
		for (int i = y; i >=0 ; i--) {
			System.out.print(arr[i]+" ");
			
		}
		
	}

}