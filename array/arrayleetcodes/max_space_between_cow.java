package arrayleetcodes;


import java.util.Arrays;
import java.util.Scanner;

public class max_space_between_cow {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int c = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = a.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(maxspace(arr, c));

	}

	public static int maxspace(int[] arr, int c) {
		int l = 0;
		int h = arr[arr.length-1] - arr[0];
		int ans=0;
		while (l <= h) {
			int mid = (h + l) / 2;
			if (a(arr, mid, c) == true) {
				 ans = mid;
				l = mid + 1;

			} else {
				h = mid - 1;

			}

		}return ans;

	}

	public static boolean a(int[] arr, int mid, int c) {
		int cow = 1;
		int pos = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] - pos >= mid) {
				cow++;
				pos = arr[i];

			} 
			if(cow==c) {
				return true;

			}

		}
		return false;

	}

}
