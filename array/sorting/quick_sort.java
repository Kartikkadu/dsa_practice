package sorting;

public class quick_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		Sort(arr, 0, arr.length-1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void Sort(int[] arr, int s, int e) {
		if (s>=e) {
			return;
		}
		int idx=Partition(arr,s,e);
		Sort(arr, s, idx-1);
		Sort(arr, idx+1, e);
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
