package com.dsa.sorting;

public class InsertionSort {


    public static void main(String[] args) {

        int[] arr = { 64, 34, 25, 12, 22, 5, 11, 90, 100 };
        int n = arr.length;

        insertionSort(arr, n);
        printArray(arr);

    }

    private static void insertionSort(int[] arr, int n) {

        for (int i = 1; i < n; i++) {

            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }

    }

    private static void printArray(int[] arr) {

        for (int i: arr) {
            System.out.println(i);
        }
    }
}
