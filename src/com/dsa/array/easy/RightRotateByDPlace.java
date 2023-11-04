package com.dsa.array.easy;

import java.util.Arrays;

public class RightRotateByDPlace {

    public static void rotate(int[] nums, int k) {
        int n  = nums.length;

        //reverse first n - k elements
        reverseArray(nums, 0, n - k -1);
        // reverse last k elements
        reverseArray(nums, n -k, n - 1);
        //reverse whole array
        reverseArray(nums, 0, n - 1);

    }

    private static void reverseArray(int[] nums, int start, int end){

        while (start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }

        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        rotate(new int[] {1,2,3,4,5}, 2);

    }
}
