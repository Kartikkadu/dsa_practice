package arrayleetcodes;

public class Remove_Duplicates_from_Sorted_Array_Q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {0,0,1,1,1,2,2,3,3,4};
		int []nums=new int[arr.length];
		System.out.println(delete(arr));
	
		
		
	}
	public static int delete(int[]arr) {
		int s=1;
		int temp=arr[0];
		int e=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(temp != arr[i]) {
				arr[s]=arr[i];
				s++;
			}
			temp=arr[i];
			
		}return s;
	
	}

}
