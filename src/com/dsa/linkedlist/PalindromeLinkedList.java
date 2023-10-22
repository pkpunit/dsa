package com.dsa.linkedlist;




 // Definition for singly-linked list.
 class ListNode {
  int val;
  ListNode next;
  ListNode() {}
 ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
// Leetcode solution for palindrome
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null)
            return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next!= null && fast.next.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = reverse(slow.next);
        slow = slow.next;

        ListNode dummy = head;
        while(slow!=null){
            if(dummy.val != slow.val)
                return false;
            slow = slow.next;
            dummy = dummy.next;
        }
        return true;
    }

    private ListNode reverse(ListNode ptr){

        ListNode pre = null;
        ListNode nex;

        while(ptr != null){
            nex = ptr.next;
            ptr.next = pre;
            pre = ptr;
            ptr = nex;
        }

        return pre;
    }
}