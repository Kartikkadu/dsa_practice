package basic;

public class cointoss_without_consicutive_head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		flip(n, "");
		

	}
	public static void flip(int n,String ans) {
		if (n==0) {
			System.out.println(ans);
			return;
			
		}if( ans.length()==0||ans.charAt(ans.length()-1)!='H') {
		flip(n-1, ans+"H");
		}
		flip(n-1, ans+"T");
		
	}

}
