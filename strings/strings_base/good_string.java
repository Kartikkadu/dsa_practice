package strings_base;

import java.util.Scanner;

public class good_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		System.out.println(substring(s));
		

	}
	public static int substring(String s) {
		int count=0;
			int ans=0;
		for (int i = 0; i < s.length(); i++) {
			
			char ch=s.charAt(i);
			if(isvowel(ch)==true) {
				count++;
				
				
			}else {
				ans=Math.max(ans, count);
						count=0;
			}
			ans=Math.max(ans, count);
		}return ans;
		
	}
	public static boolean isvowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}return false;
		
	}

}
