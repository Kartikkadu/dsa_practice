package arraybase;

import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt();
		}
		
		
		System.out.println(max(arr ));

	}

	public static int max(int[]arr) {
		int m=arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			
			if (m<arr[i]) {
				m=arr[i];
				
			}
		}
		return m;
		
		
	}

}