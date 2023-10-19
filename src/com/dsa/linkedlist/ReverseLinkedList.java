package com.dsa.linkedlist;

public class ReverseLinkedList {

    public static MyLinkedList reverseLinkedList(MyLinkedList myLinkedList){

        MyLinkedList.Node current = myLinkedList.head;
        MyLinkedList.Node prev = null;
        MyLinkedList.Node nextNode;

        while (current !=null){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        myLinkedList.head = prev;

        return myLinkedList;
    }
}
