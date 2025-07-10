package basic;

public class dice {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		

		flip(n, 0,"");
		

		}
		public static void flip(int n,int ans,String x) {
			if (n==ans) {
				
				System.out.println(x+" ");
				return;
				
			}
			if (ans>n) {
				return;
				
			}
			flip(n, ans+1,x+1);
			flip(n, ans+2,x+2);
			flip(n, ans+3,x+3);
		}

	}


