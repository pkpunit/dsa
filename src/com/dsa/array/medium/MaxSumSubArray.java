package com.dsa.array.medium;

public class MaxSumSubArray {

    public static int maxSubArray(int[] nums) {

        //if we have to find the start and end index of sub array

        int maximumSum = Integer.MIN_VALUE;
        int n = nums.length;
        int sum = 0;
        int ansStart = -1;
        int ansEnd = -1;
        int start = 0;
        for (int i = 0; i < n; i++) {
            if (sum == 0){
                start = i;
            }
            sum+=nums[i];
            if (sum > maximumSum){
                maximumSum = sum;
                ansStart = start;
                ansEnd = i;
            }

            if (sum < 0)
                sum = 0;
        }
        System.out.println(ansStart +":"+ansEnd);
    return maximumSum;
    }

    public static void main(String[] args) {
        int result = maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4});
        System.out.println(result);
    }

}
