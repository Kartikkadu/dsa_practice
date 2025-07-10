package arrayleetcodes;

public class search_in_rotated_array_Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
		int t=0;
		System.out.println(findk(arr,t));

	}

	public static int findk(int[] arr,int t) {
		int ans = 0;
		int i = 0;
		int j = arr.length - 1;
		
		while (i <= j) {
			int mid = (i + j) / 2;
			if (t==arr[mid]) {
				
				return mid;
				
			} if(arr[mid]>=arr[i]){
				if (arr[i]<=t&&t<arr[mid]) {
					j=mid-1;
					
				}else {
					i=mid+1;
				}

			}else {
				if (arr[j]>=t&&arr[mid]<t) {
					i=mid+1;
					
				} else {
					j=mid-1;

				}
				
			}
			
		}return -1;
	}

}
