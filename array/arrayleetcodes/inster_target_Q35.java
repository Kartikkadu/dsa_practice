 package arrayleetcodes;

public class inster_target_Q35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,6};
		int target=2;
		System.out.println(position(arr, target));

	}
	public static int position(int[]arr,int target) {
		int x=arr.length-1;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]<target) {
				continue;
			} else {
				x=i;
				return x;

			}
		}return x;
	}

}
