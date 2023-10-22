package com.dsa.linkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class InterSectionOfTwoLinkedList {

    //Brute force solution whih O(n*m) time complexity

/*    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        while(headA != null){

            ListNode temp = headB;
            while(temp != null){
                if(temp == headA){
                    return temp;
                }
                temp = temp.next;
            }
            headA = headA.next;
        }
        return null;
    }*/


}