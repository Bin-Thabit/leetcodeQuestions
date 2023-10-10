package LinkedList;

public class Merge_Two_Sorted_Lists {

	// https://leetcode.com/problems/merge-two-sorted-lists/description/
	// 21. Merge Two Sorted Lists
	
	/*
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode tail = head;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }
            else {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }
        }

        tail.next = (list1 != null) ? list1 : list2;
        return head.next;
    }
    */
}
