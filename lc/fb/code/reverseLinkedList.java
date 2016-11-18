/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution { 
	public ListNode reverseLinkedList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode second = head.next;
        head.next = null;
        
        ListNode res = reverseList(second);
        second.next = head;
        
        return res;
	}
}