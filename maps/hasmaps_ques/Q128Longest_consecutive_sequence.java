package hasmaps_ques;

import java.util.HashMap;

public class Q128Longest_consecutive_sequence {
	public static void main(String[] args) {
		int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 };
		System.out.println(ans(nums));
	}

	public static int ans(int[] arr) {
		HashMap<Integer, Boolean> map=new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i]-1)) {
				map.put(arr[i], false);
			
		} else {
			map.put(arr[i], true);

		}
			if (map.containsKey(arr[i]+1)) {
				map.put(arr[i]+1, false);
			}
		}
		int a=0;
		for (int i : map.keySet()) {
			if (map.get(i)) {
				int count = 0;
				while (map.containsKey(i)) {
					i++;
					count++;
				}
				a=Math.max(count, a);
			}
		}return a;

	}

}
