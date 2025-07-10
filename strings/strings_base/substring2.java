package strings_base;

public class substring2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		substring(s);

	}
	public static void substring(String s) {
		for (int i = 0; i < s.length(); i++) {
			int j= i+1;
			while(j<=s.length()) {
				System.out.println(s.substring(i,j));
				j++;
			}
			
		}
		
	}

}
