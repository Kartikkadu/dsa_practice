package arrayleetcodes;

import java.util.Arrays;
import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int c = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = a.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(answer(arr,c));

	}

	public static int answer(int[] arr, int c) {
		int l = 0;
		int h = arr.length - 1;
		int ans = 0;
		while (l <= h) {
			int mid = (h + l) / 2;
			if (a(arr, c,mid) ==true) {
				ans = mid;
				l = mid + 1;

			} else {
				h = mid - 1;
			}

		}
		return ans;

	}

	public static boolean a(int[]arr,int c,int mid) {
		int cow=1;
		int pos=arr[0];
		for (int i = 1; i < arr.length; i++) {
			
		
		if (arr[i]-pos>=mid) {
			pos=arr[i];
			cow++;
			
		}
		if(c==cow) {
			return true;
		}

		}return false;
	}

}
