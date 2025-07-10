package search;

import java.util.Scanner;
import java.lang.Math;

public class kth_root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
	
		int k=a.nextInt();//k is power of ans
		int x=a.nextInt();//ans to power k will exced by x
		System.out.println(searchroot( k, x));
		
		
	}
	public static int searchroot(int k,int x) {
		int l=0;
		int h=x-1;
		
		int ans=0;
		while (l<=h) {
			int mid=h+(l-h)/2;
			if (Math.pow(mid, k)<=x) {
				ans=mid;
				l=mid+1;
			
			} else {h=mid-1;

			}
			
		}return ans;
		
	}

}





