package arrayleetcodes;

import java.util.Arrays;
import java.util.Scanner;

public class max_pages_read_by_student {

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
		int h = 0;
		for (int i = 0; i < arr.length; i++) {
			h+=arr[i];
		}
		int ans = 0;
		while (l <= h) {
			int mid = (h + l) / 2;
			if (a(arr, mid, c) == true) {
				ans = mid;
				h = mid - 1;

			} else {
				l = mid + 1;

			}

		}
		return ans;

	}

	public static boolean a(int[] arr, int mid, int c) {
		int cow = 1;
		int pos = 0;
		for(int i=0;i<arr.length;){
			if (arr[i] + pos <= mid) {
				
				pos += arr[i];
                i++;
			} 
			else
				{
				c++;
				pos=0;
				

			}
			if (cow>c) {
				return false;
			}

		}
		return true;

	}

}
