package LinkedList;

public class Linked_List_Cycle_II {

	// https://leetcode.com/problems/linked-list-cycle-ii/description/
	// 142. Linked List Cycle II

	/*
	int countNodesinLoop(ListNode head)
    {
        //Add your code here.
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // Find the length of the cycle
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp != slow);
                
                return length;
            }
        }
        // That means there is no cycle in the LinkedList
        return 0;
    }
    public ListNode detectCycle(ListNode head) {
			int length = countNodesinLoop(head);
	        ListNode start = head;
	        ListNode end = head;
			// That means there is no cycle
			if(length == 0){
				return null;
			}
			while(length > 0){
				start = start.next;
				length--;
			}
			while(start != end){
				start = start.next;
				end = end.next;
			}

			return start;
	        
    }
    */
}
