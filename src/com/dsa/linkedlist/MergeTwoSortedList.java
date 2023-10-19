package com.dsa.linkedlist;

public class MergeTwoSortedList {

    public static MyLinkedList.Node mergeTwoLists(MyLinkedList.Node list1, MyLinkedList.Node list2){


        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }
        if (list1.data > list2.data){
            MyLinkedList.Node temp = list1;
            list1 = list2;
            list2 = temp;
        }
        MyLinkedList.Node res = list1;
        while (list1 != null && list2 != null){

            MyLinkedList.Node temp = null;

            while (list1 != null && list1.data <= list2.data){
                temp = list1;
                list1 = list1.next;
            }
            temp.next = list2;
            MyLinkedList.Node tmp = list1;
            list1 = list2;
            list2 = tmp;
        }
        return res;
    }
}
