package recursion_leetcode;

public class Q88maerge_sorted_array_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {1,2,3};
		int nums2[]= {2,5,6};
		int []nums1=mergedarray(nums,nums2);
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i]+" ");
			
		}
		

	}

	public static int[] mergedarray(int[] nums, int[] nums2) {
		// TODO Auto-generated method stub
		int a=nums.length;
		int b=nums2.length;
		int []nums1= new int[a+b];
		int i=0;int j=0;int k=0;
		while (i<a&&j<b) {
			if (nums[i]<nums2[j]) {
				nums1[k]=nums[i];
				i++;
				k++;
			}else {
				nums1[k]=nums2[j];
				j++;
				k++;
				
			}}
			while (i<a) {
				nums1[k]=nums[i];
				i++;k++;
			}
			while (j<b) {
				nums1[k]=nums2[j];
				j++;k++;
			}
		return nums1;
	}

}
