package two_D_array;

import java.util.Scanner;

public class user_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n= sc.nextInt(); //no. of rows
		int m= sc.nextInt();// no. of column
		int arr[][]= new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=sc.nextInt();
				
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+ " ");;
				
			}
			System.out.println();
		}
		

	}

}
