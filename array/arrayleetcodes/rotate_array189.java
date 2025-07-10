package arrayleetcodes;

import java.util.Scanner;

public class rotate_array189 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt();
		}
		int r =a.nextInt();
		rotate(arr,r,n);
		display(arr);
		
		

	}
	public static void rotate(int arr[],int r,int n) {
		
		int x =arr.length;
		r =r %x;
		for (int j = 0; j < r; j++) {
			
		
		int temp= arr[n-1];
		for (int i = n-2; i >=0; i--) {
			arr[i+1]=arr[i];
		}
		arr[0]=temp;
		}
		
	}
	public static void display(int arr[])
{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

}