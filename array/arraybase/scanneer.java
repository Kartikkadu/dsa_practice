package arraybase;

import java.util.Scanner;

public class scanneer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int[] arr=new int[n];
		 for (int i = 0; i < arr.length; i++) {
			  arr[i]=a.nextInt();
		 }
//		 int x=0;
//		 int y=arr.length-1;
//		 while (x<y) {
//				int temp=arr[x];
//				arr[x]=arr[y];
//				arr[y]=temp;
//				x++;
//				y--;			
//			}
//		 for (int i = 0; i < arr.length; i++) {
//				System.out.print(arr[i] + " ");
//			}
		 int x=0;
		 for (int i = 0; i < arr.length; i++) {
			x=x+arr[i];
		}
		 System.out.println(x);

	}

}
