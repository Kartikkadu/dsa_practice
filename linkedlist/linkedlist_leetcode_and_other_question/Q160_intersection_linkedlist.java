package linkedlist_leetcode_and_other_question;

import java.util.LinkedList;

public class Q160_intersection_linkedlist {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}
	
	

	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			ListNode v = headA;
			ListNode vgf = headB;
			while (v != vgf) {
				if (v == null) {
					v = headB;
				} else {
					v = v.next;

				}
				if (vgf == null) {
					vgf = headA;
				} else {
					vgf = vgf.next;
				}
			}
			return v;

		}
	}
}
