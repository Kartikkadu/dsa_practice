package arrayleetcodes;

import java.util.Arrays;

public class cookie_greed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,3,4,5,7};
		int arr2[]= {1,2,5,8,9};
		System.out.println(greed(arr1, arr2));
		

	}
	public static int greed(int[]arr1,int[]arr2) {
		int ans=0;
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0;
		int j=0;
		while(j<arr2.length&&i<arr1.length) {
			if (arr1[i]<=arr2[j]) {
				ans++;
				i++;
				j++;
				
			}else{j++;
		}
		}
		
			
		return ans;
	}

}
