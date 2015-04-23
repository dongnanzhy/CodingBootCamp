package HW4;

import java.util.ArrayList;

import HW3.BuildList;
import HW3.BuildList.ListNode;

public class isPalindrome {
	public boolean isPalin(ListNode head) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		ListNode newHead = reverse(dummy.next);
		for (int i : list) {
			if (i == newHead.val) {
				newHead = newHead.next;
			} else {
				return false;
			}
		}
		return true;
	}
	public ListNode reverse(ListNode head) {
		ListNode prev = null;
		while (head != null) {
			ListNode tmp = head.next;
			head.next = prev;
			prev = head;
			head = tmp;
		}
		return prev;
	}
	
	   public static void main (String[] args) {
	    	int[] num = {2,1,3,6,6,3,1};
	    	BuildList build = new BuildList();
	    	ListNode head = build.buildList(num);
	    	
	    	isPalindrome rst = new isPalindrome();
	    	System.out.println(rst.isPalin(head));
	    }
}
