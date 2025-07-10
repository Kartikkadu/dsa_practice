package arrayleetcodes;

public class spiral_matrix_54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		
		print(arr);

	}

	public static void print(int [][]arr) {
		int minr = 0;
		int minc = 0;
		int maxr = arr.length - 1;
		int maxc = arr[0].length - 1;
		int n = arr.length * arr[0].length;
		int i = 0;
		while (i < n) {
			for (int j = minc; j <= maxc && i < n; j++) {
				System.out.print(arr[minr][j] + " ");
				i++;

			}
			minr++;
			for (int j = minr; j <= maxr && i < n; j++) {
				System.out.print(arr[j][maxc]+" ");
				i++;

			}
			maxc--;
			for (int j = maxc; j >= minc && i < n; j--) {
				System.out.print(arr[maxr][j]+" ");
				i++;
			}
			maxr--;
			for (int j = maxr; j >= minr && i < n; j--) {
				System.out.print(arr[j][minc]+" ");
				i++;
			}
			minc++;

		}
	}

}
