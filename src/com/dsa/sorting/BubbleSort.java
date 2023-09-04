package com.dsa.sorting;

public class BubbleSort {


    public static void main(String[] args) {

        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;

        bubbleSort(arr, n);
        printArray(arr);

    }

    private static void printArray(int[] arr) {

        for (int i: arr) {
            System.out.println(i);
        }
    }

    private static void bubbleSort(int[] arr, int n) {

        boolean swapped = false;
        for (int i = 0; i < n -1 ; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j+1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }

            }
            if (!swapped)
                break;

        }
    }

}
