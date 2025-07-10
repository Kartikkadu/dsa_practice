package arrayleetcodes;

import java.util.Arrays;

public class Q448Find_All_Numbers_Disappeared_in_an_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
		disapeardnums(arr);

	}

	public static void disapeardnums(int[] arr) {
		Arrays.sort(arr);
	int[] temp=new int[arr.length+1];
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>=1&arr[i]<=arr.length) {
			temp[arr[i]]=1;
		}
	}
	for (int i = 1; i < temp.length; i++) {
		if (temp[i]!=1) {
			System.out.print(i+" ");
		}
	}
		

	}

}
