package arraybase;

import java.util.Scanner;

public class swap {

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
		
		swapp(arr, x, y);
		
		display(arr);

	}

	public static void swapp(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;

	}

	public static void display(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}System.out.println();

	}
}