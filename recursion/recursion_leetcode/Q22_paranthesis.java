package recursion_leetcode;

public class Q22_paranthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		int x=0;
		int y=0;
		gen(n,x,y,"");

	}public static void gen(int n,int x,int y,String z) {
		if (x==n&&y==n) {
			System.out.println(z);
			return;
		}
		if (x>n||y>n) {
			return;
			
		}
		if (y>x ) {
			return ;
		}
		gen(n, x+1, y, z+"(");
		gen(n, x, y+1, z+")");
	}

}
