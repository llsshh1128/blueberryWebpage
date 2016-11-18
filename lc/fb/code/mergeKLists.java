public class Solution { 
	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) {
			return null;
		}

		PriorityQueue<ListNode> pq = 
		    new PriorityQueue<ListNode>(lists.length, 
		    			new Comparator<ListNode>(){
		    	@Override
				public int compare(ListNode l1, ListNode l2) {
					return l1.val - l2.val;
				}

		});

		for(int i = 0; i < lists.length; i++){
            if(lists[i] != null)
                pq.add(lists[i]);
        }
        
        ListNode dummy = new ListNode(0);
        ListNode move = dummy;
        
        while(!pq.isEmpty()){
            ListNode head = pq.poll();
            move.next = head;
            if(head.next != null)
                pq.add(head.next);
            move = move.next;
        }
        
        return dummy.next;


	}

	public class ListNode {
		int val;
		ListNode next;

		public ListNode(int value) {
			this.val = value;
		}
	}
}