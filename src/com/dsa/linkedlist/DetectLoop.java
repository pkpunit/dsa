package com.dsa.linkedlist;

public class DetectLoop {

//solution to detect cycle using extra space

/*    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();
        while (head != null){
            if(set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }*/

/*    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){

            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                return true;

        }
        return false;

    }*/


}
