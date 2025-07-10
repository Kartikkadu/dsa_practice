package dsa_java;

import java.util.Stack;

public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 13, 21, 3 };
		NGE(arr);
		

	}
	public static void NGE(int[] arr) {
		int[] ans= new int[arr.length];
		Stack<Integer> st=new Stack();
		for (int i = 0; i < arr.length; i++) {
			while (!st.empty()&&arr[i]>arr[st.peek()]) {
				ans[st.pop()]=arr[i];
				}
			st.push(i);
		}
		while (!st.empty()) {
			ans[st.pop()]=-1;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
