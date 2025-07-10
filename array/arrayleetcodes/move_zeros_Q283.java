package arrayleetcodes;

public class move_zeros_Q283 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 0, 0, 1, 3, 12 };
		arrange(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static int[] arrange(int[] arr) {

		int i =0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[j]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				
			}
		}return arr;

	}

}
