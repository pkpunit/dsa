package com.dsa.linkedlist;

public class MiddleOfTheLinkedList {

    public static MyLinkedList.Node findMiddleNode(MyLinkedList list){

        MyLinkedList.Node slow = list.head;
        MyLinkedList.Node fast = list.head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;
        }
        return slow;
    }


    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.insertItem(myLinkedList, 1);
        myLinkedList.insertItem(myLinkedList, 2);
        myLinkedList.insertItem(myLinkedList, 3);
        myLinkedList.insertItem(myLinkedList, 4);
        myLinkedList.insertItem(myLinkedList, 5);
        MyLinkedList.printList(myLinkedList);

        MyLinkedList.Node middleNode = findMiddleNode(myLinkedList);
        System.out.println(middleNode.data);

        myLinkedList.head = middleNode;
        MyLinkedList.printList(myLinkedList);

        

    }
}
