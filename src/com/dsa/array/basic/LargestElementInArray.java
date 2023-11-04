package com.dsa.array.basic;

public class LargestElementInArray {

    static int largestElement(int[] arr, int n) {
        // Write your code here.

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] >  largest)
                largest = arr[i];
        }
        return largest;
    }
}
