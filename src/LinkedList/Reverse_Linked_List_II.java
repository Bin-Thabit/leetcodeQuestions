package LinkedList;

public class Reverse_Linked_List_II {

	// https://leetcode.com/problems/reverse-linked-list-ii/description/
	// 92. Reverse Linked List II

	/*
	public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        ListNode prev = null;
        ListNode current = head;
        for(int i = 0; current != null && i < left - 1; i++){
            prev = current;
            current = current.next;
        }
        ListNode last = prev;
        ListNode newEnd = current;
        // reverse from left to right
        ListNode next;
        for(int i = 0; current != null && i < right - left + 1; i++){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next; 
        }

        if(last == null){
            head = prev;
        }
        else {
            last.next = prev;
        }

        newEnd.next = current;
        return head;
    }
    */
}
