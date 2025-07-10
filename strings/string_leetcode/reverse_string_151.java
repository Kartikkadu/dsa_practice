package string_leetcode;

public class reverse_string_151 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "the sky is blue";
		System.out.println(reverse_string(s));

	}

	public static String reverse_string(String s) {
		s = s.trim();
		String[] arr = s.split("\s+");
		String ans = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			ans = ans + arr[i] + " ";

		}

		return ans.trim();
	}

}
