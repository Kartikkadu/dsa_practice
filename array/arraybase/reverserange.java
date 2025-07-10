package arraybase;

import java.util.Scanner;

public class reverserange {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt();
		}
			int x = a.nextInt();
			int y = a.nextInt();
			display(arr);
			reverse(arr, x, y);
			display(arr);

		

	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}
	public static void reverse(int[]arr,int x,int y) {
		while (x<y) {
			int temp=arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
			x++;
			y--;
			
			
		}
		
	}
}
