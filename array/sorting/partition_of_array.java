package sorting;

public class partition_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// in this question we have to place the last index in such way that in left
		// side of
		// array the numbers will be smaller and on right side bigger without sorting
		// if we have to to place any particular index then first swap the index with
		// last element
		int[] arr = { 5, 7, 2, 1, 8, 3, 4 };
		int idx = Partition(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
		System.out.println(idx);

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
