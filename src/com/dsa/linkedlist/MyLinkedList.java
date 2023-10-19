package com.dsa.linkedlist;

public class MyLinkedList {

    Node head = null;
     static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }


    //method for appending at last
    public MyLinkedList insertItem(MyLinkedList list, int data){

        Node node = new Node(data);

        if(list.head == null){
            list.head = node;
        }else {
            Node last = list.head;
            while (last.next != null){
                last = last.next;
            }
            last.next = node;
        }
        return list;

    }

    public static void printList(MyLinkedList myLinkedList){
        Node node = myLinkedList.head;

        while (node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void printList(Node head){
        Node node = head;

        while (node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        MyLinkedList myLinkedList = getMyLinkedList();
        myLinkedList.insertItem(myLinkedList, 1);
        myLinkedList.insertItem(myLinkedList, 5);
        myLinkedList.insertItem(myLinkedList, 5);
        myLinkedList.insertItem(myLinkedList, 7);
        myLinkedList.insertItem(myLinkedList, 7);
        myLinkedList.insertItem(myLinkedList, 7);
        myLinkedList.insertItem(myLinkedList, 10);
        MyLinkedList myLinkedList1 = getMyLinkedList();
        myLinkedList1.insertItem(myLinkedList1, 2);
        myLinkedList1.insertItem(myLinkedList1, 6);
        myLinkedList1.insertItem(myLinkedList1, 11);
        myLinkedList1.insertItem(myLinkedList1, 14);
        printList(myLinkedList);

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
       // MyLinkedList uniqueDataLinkedList = removeDuplicates.removeDuplicates(myLinkedList);
        MyLinkedList uniqueDataLinkedList = removeDuplicates.removeDupNode(myLinkedList);
/*        System.out.println("after removing duplicates");
        printList(uniqueDataLinkedList);

        MyLinkedList deleatedList = DeleteFromLast.deleteKthNodeFromLast(uniqueDataLinkedList, 2);
        System.out.println("after deletion");
        printList(deleatedList);
        System.out.println("reversed linked list");
        MyLinkedList reversedList = ReverseLinkedList.reverseLinkedList(deleatedList);
        printList(reversedList);*/

        System.out.println("linhed list 1");
        printList(uniqueDataLinkedList.head);
        System.out.println("Linked List 2");
        printList(myLinkedList1.head);

        Node head =  MergeTwoSortedList.mergeTwoLists(uniqueDataLinkedList.head , myLinkedList1.head);

        System.out.println("after merge");
        printList(head);
    }

    private static MyLinkedList getMyLinkedList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        return myLinkedList;
    }

}
