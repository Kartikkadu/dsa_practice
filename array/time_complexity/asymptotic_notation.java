package time_complexity;

import java.util.Iterator;
import java.util.Scanner;

public class asymptotic_notation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int n = a.nextInt();
		int r=a.nextInt();
		int num=ncr(n);
		int deno=ncr(r)*(ncr(n-r));
		System.out.println(num/deno);

	}
	public static int ncr(int n) {
		int ans=1;
for (int i = 1; i <=n; i++) {
	ans=ans*i;
	
}
return ans;
		
		
		
		
	}
	

}
