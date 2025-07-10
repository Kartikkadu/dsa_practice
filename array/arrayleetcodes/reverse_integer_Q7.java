package arrayleetcodes;

public class reverse_integer_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = -123;
		

		System.out.println(reverse(i));
		
	}

	public static int reverse(int i) {
		int u = i;
		int ans = 0;
		int x = 0;
		while (u != 0) {
			x = u % 10;
			ans = ans * 10 + x;
			u/= 10;
		}
		return ans;

	}

}
