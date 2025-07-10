package arrayleetcodes;

public class Subarray_Product_Less_Than_K {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 2 };
		int k = 10;
		System.out.println(a(arr, k));

	}public static int a(int[]arr,int k) {
		int e=0;
		int s=0;
		int p=1;
		int ans=0;
		while (e<arr.length) {
			p=p*arr[e];
			while (p>=k) {
			
				p=p/arr[s];
					s++;
			}
			ans=ans+(e-s+1);
			e++;
		}return ans;
				
	}

}
