package linkedlist_leetcode_and_other_question;

public class Q21_merge_sorted_list {

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
	public ListNode merge(ListNode list1, ListNode list2) {
		ListNode dummy=new ListNode();
		ListNode temp=dummy;
		while (list1!=null&&list2!=null) {
			if (list1.val>list2.val) {
				dummy=list2;
				list2=list2.next;
				dummy=dummy.next;
			} else {
				dummy=list1;
				list1=list1.next;
				dummy=dummy.next;

			}
		}
		if (list1==null) {
			dummy=list2;
		}
		if (list2==null) {
			dummy=list1;
		}
		return temp.next;
	}

}
