package strings_base;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		substring(s);
		

	}
	public static void substring(String s) {
		for (int i = 0; i < s.length(); i++) {
			for (int j = i; j <=s.length(); j++) {
				System.out.println(s.substring(i,j));
				
			}
		}
	}

}
