package HW3;

import java.util.Hashtable;

import HW3.BuildList.ListNode;

public class RemoveDuplicate {
	public void remove(ListNode head) {
		Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		head = dummy;
		while (head != null && head.next != null) {
			if (table.containsKey(head.next.val)) {
				head.next = head.next.next;
			} else {
				table.put(head.next.val, 1);
			}
			head = head.next;
		}
		head = dummy.next;
	}
	
    public static void main (String[] args) {
    	int[] num = {1,4,6,2,5,5};
    	BuildList build = new BuildList();
    	ListNode head = build.buildList(num);
    	
    	RemoveDuplicate rst = new RemoveDuplicate();
    	rst.remove(head);
    	
    	build.print(head);
    }
}
