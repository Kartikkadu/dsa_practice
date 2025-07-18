package array;

public class Quick_selcet {

	public static void main(String[] args) {
		int[] arr = {5, 7, 2, 1, 8, 3, 4};
		int k = 3; // 3rd largest
		int n = arr.length;

		int ans = quickSelect(arr, 0, n - 1, n - k); // convert to kth smallest index
		System.out.println(k + "th largest element is: " + ans);
	}

	public static int quickSelect(int[] arr, int i, int j, int k) {
		
		if (i<=j) {	
		int index=Partition(arr, i, j);
		if (index==k) {
			return arr[index];
		} else if(index<k) {
			return quickSelect(arr, index+1, j, k);

		}else {
			return quickSelect(arr, i, index-1, k);
		}
		}
		return -1;
	}
		
		
	
	public static int Partition(int[] arr, int s, int e) {
		int idx = s;
		for (int i = s; i < e; i++) {
			if (arr[i] < arr[e]) {
				int temp=arr[idx];
				arr[idx]=arr[i];
				arr[i]=temp;
				idx++;
			}

		}int temp=arr[e];
		arr[e]=arr[idx];
		arr[idx]=temp;
		return idx;

	
	}
}
