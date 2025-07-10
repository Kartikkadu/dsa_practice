package search;

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a.nextInt();
		}
		int x=a.nextInt();
		System.out.println(serch(arr,x));

	}
	public static int serch(int[]arr,int x) {
		int l=0;
		int h = arr.length-1;
		int mid=h+(l-h)/2;
		
		while (l<=h) {
			
			if (arr[mid]==x) {
				int ans=mid;
				return ans;
			}else if(x<arr[mid]) {
				h=mid-1;
			}else {
				l=mid+1;
			}
			
		}return -1;
		
	}

}
