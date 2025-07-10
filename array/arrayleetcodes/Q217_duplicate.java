package arrayleetcodes;
import java.util.Arrays;

public class Q217_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,1};
		Arrays.sort(arr);
		System.out.println(duplicate(arr));
	}
		public static boolean duplicate(int[] arr) {
			int i=1;
			int j=0;
			while (i<=arr.length) {
				if (arr[i]==arr[j]) {
					return true;
				} else {
					i++;
					j++;

				}
				
			
		}return false;
}

	

}
