package strings_base;

import java.util.Scanner;

public class equal_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		String s=sc.next();
		String ss=sc.next();
		System.out.println(eq(s,ss));
		
		

	}
	public static boolean eq(String s,String ss) {
		if(s!=s) {
			return false;
		}
		if(s.length()!=ss.length()) {
			return false;
		}
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!= ss.charAt(i)) {
				return false;
			}
			
		}
		return true;
	}

	}


