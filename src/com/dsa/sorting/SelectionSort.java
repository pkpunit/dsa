package com.dsa.sorting;

public class SelectionSort {



    private static void selectionSort(int[] arr, int n){

        for (int i = 0; i < n; i++) {

            int min_index = i;
            for (int j = i + 1; j < n ; j++) {
                if (arr[j] < arr[min_index])
                    min_index = j;

            }

            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;

        }
    }

    public static void main(String[] args) {

        int[] arr = { 5, 4, 3, 2, 1 };
        int n = arr.length;

        selectionSort(arr, n);
        printArray(arr);

    }

    private static void printArray(int[] arr) {

        for (int i: arr) {
            System.out.println(i);
        }
    }


}
