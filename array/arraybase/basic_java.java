package arraybase;


import java.util.Scanner;

public class basic_java {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr=new int[n];
		 for (int i = 0; i < arr.length; i++) {
			  arr[i]=a.nextInt();
		 }
		 if((arr[0]^arr[1])==1) {
			 System.out.print("1");
		 }else {
			 System.out.println("0");
		 }
		

	}


}