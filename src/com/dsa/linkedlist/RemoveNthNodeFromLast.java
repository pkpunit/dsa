package com.dsa.linkedlist;

public class RemoveNthNodeFromLast {


    public static MyLinkedList deleteKthNodeFromLast(MyLinkedList myLinkedList, int k){


        MyLinkedList.Node start = new MyLinkedList.Node(0);
        start.next = myLinkedList.head;
        MyLinkedList.Node slow = start;
        MyLinkedList.Node fast = start;

        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        myLinkedList.head = start.next;
        return myLinkedList;
    }
}
