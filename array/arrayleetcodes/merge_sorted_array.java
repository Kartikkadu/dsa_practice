package arrayleetcodes;

import java.util.Scanner;

public class merge_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int m = 3;
		int[] nums2 = {2,5,6};
		int n = 3;
		merge(nums1,m,nums2,n);
		for (int i = 0; i < nums1.length; i++) {
			 System.out.print(nums1[i]+" ");
			
		}
		}
		

	
	public static int[] merge (int[]nums1,int m,int[]nums2,int n) {
		int p1=m-1;
        int p2=n-1;
        int k=m+n-1;
        while(p2>=0){
            if(p1>=0&&nums1[p1]>nums2[p2]){
                 nums1[k]=nums1[p1];
                 k--;
                p1--;
            }else{
               nums1[k]=nums2[p2];
                k--;
                p2--;
            }
        }return nums1;
		
		
	}

}
