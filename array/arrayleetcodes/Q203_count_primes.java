package arrayleetcodes;

public class Q203_count_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 2;
		System.out.println(PrimeSieve(n));


	}
	public static int PrimeSieve(int n) {
		boolean []prime=new boolean[n];
		prime[0]=true;
		prime[1]=true;
		for (int i = 2; i*i <= n; i++) {
			if (prime[i]==false) {
				for (int j = 2; i*j < prime.length; j++) {
					prime[i*j]=true;
				}
			}
		}int x=0;
		for (int i = 0; i < prime.length; i++) {
			if (prime[i]==false) {
				x++;
			}
		}return x;
	}

}
