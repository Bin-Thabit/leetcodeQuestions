package LinkedList;

public class Find_length_of_loop_cycle_in_given_Linked_List {

	// https://www.geeksforgeeks.org/find-length-of-loop-in-linked-list/#practice
	// Find length of loop/cycle in given Linked List
	
	/*
	static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                // Find the length of the cycle
                Node temp = slow;
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
    */
}
