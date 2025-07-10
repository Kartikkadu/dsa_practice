package arrayleetcodes;

import java.util.Scanner;

public class rotate_TLE_Q189 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt();
		}
		int k=a.nextInt();
		int z=arr.length;
		
		k=k%z;
	
		reverse(arr, 0, z-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, z-1);
		display(arr);
		
		


	}
	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
	public static void reverse(int arr[],int x,int y) {
		while(x<y) {
			int temp=arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
			x++;
			y--;
		}
		
		
		
	}

}