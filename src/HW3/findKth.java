package HW3;

import HW3.BuildList.ListNode;

public class findKth {
	public int findKthToEnd(ListNode head, int k) {
		if (head == null) {
			return Integer.MIN_VALUE;
		}
		ListNode fast = head;
		ListNode slow = head;
		for (int i = 0; i < k; i++) {
			fast = fast.next;
			if (fast == null) {
				return Integer.MIN_VALUE;
			}
		}
		while (fast != null) {
			fast = fast.next;
			slow = slow.next;
		}
		return slow.val;
	}
	
	   public static void main (String[] args) {
	    	int[] num = {2,1,3,6,8,5,7,4};
	    	BuildList build = new BuildList();
	    	ListNode head = build.buildList(num);
	    	
	    	findKth rst = new findKth();
	    	System.out.println(rst.findKthToEnd(head, 8));
	    }
}
