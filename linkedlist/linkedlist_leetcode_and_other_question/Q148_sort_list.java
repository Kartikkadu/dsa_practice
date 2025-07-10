package linkedlist_leetcode_and_other_question;

import linkedlist_leetcode_and_other_question.Middle_of_LinkedList.ListNode;

public class Q148_sort_list {
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	
	}
	class solution{
		public ListNode sortList(ListNode head) {
			if (head==null||head.next==null) {
				return head;
			}
			ListNode mid=middleNode(head);
			ListNode midnx=mid.next;
			mid.next=null;
			ListNode A=sortList(head);
			ListNode b=sortList(midnx);
			return merge(A, b);
	        
	    }
		public ListNode middleNode(ListNode head) {

			ListNode slow = head;
			ListNode fast = head;
			while (fast != null && fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			return slow;

		}
		public ListNode merge(ListNode list1, ListNode list2) {
			ListNode dummy=new ListNode();
			ListNode temp=dummy;
			while (list1!=null&&list2!=null) {
				if (list1.val>list2.val) {
					dummy.next=list2;
					list2=list2.next;
					dummy=dummy.next;
				} else {
					dummy.next=list1;
					list1=list1.next;
					dummy=dummy.next;

				}
			}
			if (list1==null) {
				dummy.next=list2;
			}
			if (list2==null) {
				dummy.next=list1;
			}
			return temp.next;
		}
	}

}
