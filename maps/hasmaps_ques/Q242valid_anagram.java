package hasmaps_ques;

import java.util.*;

public class Q242valid_anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "anagram";
		String t = "agaram";
		System.out.println(ans(s, t));

	}

	public static boolean ans(String s, String t) {
		// TODO Auto-generated method stub
		boolean ans = true;
		if (s.length() != t.length()) {
			ans = false;
			return ans;
		}
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), map.get(s.charAt(i))+1);

			} else {
				map.put(s.charAt(i), 1);

				
			}
		}

		for (int i = 0; i < t.length(); i++) {
			if (map.containsKey(t.charAt(i))&&map.get(t.charAt(i))>0) {
				map.put(t.charAt(i), map.get(t.charAt(i))-1);
			} else {
				ans = false;
				break;

			}

		}
		return ans;
	}

}
