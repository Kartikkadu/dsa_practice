package arrayleetcodes;

public class sort_colours_Q75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,0,2,1,1,0};
		so(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}public static int[] so(int[]arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}

			}

		}
		return arr;
		
	}

}
