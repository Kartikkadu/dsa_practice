package arrayleetcodes;

public class twoD_matrix_search78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target=9;
		System.out.println(search(arr,target));

	}
	public static boolean search(int arr[][],int target) {
		int row=0;
		int col=arr[0].length-1 ;
		while(0<=col&&row<arr.length) {
			if(arr[row][col]==target) {
				return true;
			}
			else if(arr[row][col]>target) {
				col--;
			}
			else {
				row++;
				
			}
			
			}return false;
		}
		
	}


