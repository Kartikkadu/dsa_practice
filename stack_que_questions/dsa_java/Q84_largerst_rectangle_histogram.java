package dsa_java;

import java.util.Stack;

public class Q84_largerst_rectangle_histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 3, 5, 4, 6, 1, 7 };
		System.out.println(Area(arr));

	}

	public static int Area(int[] arr) {
		int ans = 0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
				int h = arr[st.pop()];
				int r = i;
				if (st.isEmpty()) {
					ans = Math.max(ans, h * (r));
				} else {

					int l = st.peek();
					ans = Math.max(ans, h * (r - l - 1));
				}
			}
			st.push(i);
		}
		while (!st.isEmpty()) {
			int h = arr[st.pop()];
			int r = arr.length;
			if (st.isEmpty()) {
				ans = Math.max(ans, h * (r));
			} else {

				int l = st.peek();
				ans = Math.max(ans, h * (r - l - 1));
			}
		}
		return ans;

	}

}
