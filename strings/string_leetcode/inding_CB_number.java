package string_leetcode;

import java.util.Scanner;

public class inding_CB_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String a = sc.next();
		Substring(a);
	
	

	}
	public static void Substring(String str) {
		int count = 0;
		boolean[] visited = new boolean[str.length()];
		for (int len = 1; len <= str.length(); len++) {
			for (int j = len; j <= str.length(); j++) {
				int i = j - len;
				String s = str.substring(i, j);// string number
				if (isCBnumber(Long.parseLong(s)) == true && Isvisited(visited, i, j - 1) == true) {
					count++;
					for (int k = i; k < j; k++) {
						visited[k] = true;// marked
					}
				}

			}

		}
		System.out.println(count);

	}


		
	
	public static boolean isCBnumber(long x) {
		int[]arr= {2,3,5,7,11,13,17,19,23,29};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==x) {
				return true;
			}
		}
			if (x==1||x==0) {
				return false;
				
			}
			for (int i = 0; i < arr.length; i++) {
				if (x%arr[i]==0) {
					return false;
				}
			
			
		}
			return true;
		
	}
	public static boolean Isvisited(boolean[] visited, int i, int j) {
		// TODO Auto-generated method stub
		for (int k = i; k <= j; k++) {
			if (visited[k] == true) {
				return false;
			}
		}
		return true;
	}

}
