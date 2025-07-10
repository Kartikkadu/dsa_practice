package arrayleetcodes;

public class max_ones_Q485 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {0,1,1,1,0,1,1,0};
		System.out.println(ones(arr));

	}
	public static int ones(int[]arr) {
		int max=0;
		int count=0;
			
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==1) {
				count++;
				max=Math.max(max, count);
				
			} else {
				count=0;

			}
			
			
		}return max;
		
	}

}
