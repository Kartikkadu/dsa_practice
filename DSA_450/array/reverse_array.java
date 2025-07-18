package array;

import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int m = a.nextInt()+1;
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt();
			
		}
		int y=arr.length-1;
		reverse(arr,m,y);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(" "+arr[i]);
		}
		
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
