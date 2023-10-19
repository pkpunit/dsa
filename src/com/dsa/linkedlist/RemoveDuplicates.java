package com.dsa.linkedlist;

import java.util.HashSet;

public class RemoveDuplicates {


    //First Approach using HashSet
    public MyLinkedList removeDuplicates(MyLinkedList myLinkedList){

        MyLinkedList.Node temp = myLinkedList.head;

        HashSet<Integer> set = new HashSet<>();
        MyLinkedList.Node prev = null;
        while (temp != null){
            if (set.contains(temp.data)){
                prev.next = temp.next;
            }else {
                set.add(temp.data);
                prev = temp;
            }
            temp = temp.next;
        }
        return myLinkedList;
    }

    // Second Approach

    public MyLinkedList removeDupNode(MyLinkedList myLinkedList){

        MyLinkedList.Node temp = myLinkedList.head;

        while (temp!= null && temp.next != null){
            if (temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return myLinkedList;
    }
}
