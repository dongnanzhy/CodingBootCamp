package HW4;

import HW3.BuildList;
import HW3.BuildList.ListNode;

public class LinkedListSum {
	public ListNode addLL(ListNode head1, ListNode head2) {
		if (head1 == null && head2 == null) {
			return null;
		}
		int count = 0;
		ListNode dummy = new ListNode(0);
		ListNode newHead = dummy;
		while (head1 != null && head2 != null) {
			newHead.next = new ListNode((head1.val + head2.val + count)%10);
			count = (head1.val + head2.val + count)/10;
			newHead = newHead.next;
			head1 = head1.next;
			head2 = head2.next;
		}
		while (head1 != null) {
			newHead.next = new ListNode((head1.val + count)%10);
			count = (head1.val + count)/10;
			newHead = newHead.next;
			head1 = head1.next;
		}
		while (head2 != null) {
			newHead.next = new ListNode((head2.val + count)%10);
			count = (head2.val + count)/10;
			newHead = newHead.next;
			head2 = head2.next;
		}
		if (count > 0) {
			newHead.next = new ListNode(1);
		}
		return dummy.next;
	}
	
	   public static void main (String[] args) {
	    	int[] num1 = {7,1,6,3};
	    	int[] num2 = {5,9,2};
	    	BuildList build = new BuildList();
	    	ListNode head1 = build.buildList(num1);
	    	ListNode head2 = build.buildList(num2);
	    	
	    	LinkedListSum rst = new LinkedListSum();
	    	build.print(rst.addLL(head1, head2));
	    }
}
