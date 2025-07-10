package arrayleetcodes;

import java.util.Arrays;

import javax.swing.text.TabStop;

public class largesr_number_atleasttwice_Q747 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 4, 9, 3, 2 };
		System.out.println(max(arr));
		
		
		

	}

	public static int max(int[] arr) {
		int m=0;
		int ans=0;
		for (int i = 0; i < arr.length; i++) {
			m=Math.max(m, arr[i]);
			
		}int m2=0;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]!=m) {
				m2=Math.max(m2, arr[i]);
				
			}else {
				ans=i;
			}
			
		}if (m>=2*m2) {
			return ans;
		}else {
			return -1;
		}
		
		
	}
	

}
