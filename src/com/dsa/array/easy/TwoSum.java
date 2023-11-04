package com.dsa.array.easy;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];
        Arrays.sort(nums);
        //System.ou
        int start = 0;
        int end = nums.length - 1;

        while(start < end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                indices[0] = start;
                indices[1] = end;
                break;
            }else if(sum < target) start++;
            else
                end--;
        }
        return indices;
    }

    public static void main(String[] args) {
        int[] result = twoSum(new int[] {2,3,4}, 6);
        System.out.println(Arrays.toString(result));
    }
}
