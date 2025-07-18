package array;

public class Q3_sort_Arr_which_contains_only_0s_1s_2s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {0,2,1,1,2,0,1,2};
		int low=0;
		int mid=0;
		int high =arr.length-1;
		while (mid<=high) {
			if (arr[mid]==0) {
				swapp(arr, low, mid);
				low++;
				mid++;
			} else if(arr[mid]==1){
				mid++;
			}
				else {
				swapp(arr, mid, high);
				mid++;
				high--;

			}
		}
		

		for (int o = 0; o < arr.length; o++) {
			System.out.print(arr[o] + " ");
		}System.out.println();

	}
	public static void swapp(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;

	}

}
