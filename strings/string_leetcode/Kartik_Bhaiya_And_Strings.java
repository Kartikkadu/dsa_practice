package string_leetcode;

public class Kartik_Bhaiya_And_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aabababbabaaaaaaabbaa";
		int k = 3;
		int flipa = maxlen(str, k, 'a');
		int flipb = maxlen(str, k, 'b');
		System.out.println(Math.max(flipa, flipb));

	}
	public static int maxlen(String str,int k, char ch) {
		int s=0;
		int e=0;
		int ans=0;
		int flip=0;
		while (e<str.length()) {
			if(str.charAt(e)==ch) {
				flip++;
			}
			while(flip>k) {
				if (str.charAt(s)==ch) {
					flip--;
				}
				s++;
			}
			ans=Math.max(ans, (e-s+1));
			e++;
			
		}return ans;
		
	}

}
