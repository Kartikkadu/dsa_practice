package arrayleetcodes;

public class Single_Number_Q136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,4,2,3,2,3};
		System.out.println(sing(arr));

	}
	public static int sing(int[]arr) {
		  int l = arr.length;
	        int res = arr[0];
	        for( int i = 1; i < l; i++ ){
	            res = res^arr[i];
	        }
	        return  res;
}
}
	


