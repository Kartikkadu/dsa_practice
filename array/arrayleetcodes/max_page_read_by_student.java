package arrayleetcodes;

import java.util.Arrays;
import java.util.Scanner;

public class max_page_read_by_student {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int nos = a.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = a.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(answer(arr,nos));
		
	

	}
	public static int answer(int[]arr,int nos) {
		int l=0;
		int h=0;
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			h+=arr[i];
			
		}
		while (l<=h) {
			int mid=(h+l)/2;
			if (max(arr,nos,mid)==true) {
				ans=mid;
				h=mid-1;
				
			} else {
				l=mid+1;

			}
			
			
		}
		return ans;
		
		
	}
	public static boolean max(int[]arr,int nos,int mid) {
	int	pages=0;
		int student=1;
		for (int i = 0; i < arr.length;) {
			if (arr[i]+pages<=mid) {
				pages+=arr[i];
				i++;
				
			} else {
				pages=0;
				student++;

			} if (student>nos) {
				return false;
		
			}
			
		}return true;
		
	}

}
