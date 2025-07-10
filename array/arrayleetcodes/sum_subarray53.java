package arrayleetcodes;

public class sum_subarray53 {

	public static void main(String[] args) {
		
		int arr[]= {-2,1,-3,4,-1,2,1,-5,3};
System.out.println(a(arr));
		

	}

public static int a(int []arr) {
	int ans= Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) {
		int sum=0;
		for (int j = i; j < arr.length; j++) {
			sum=sum+arr[j];			
			ans=Math.max(ans, sum);
			
		}
		
	}
	return ans;
	
	
}
}