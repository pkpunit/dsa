package com.dsa.array.basic;

public class SortedAndRotated {

    public boolean check(int[] nums) {

        boolean rotated = false;
        int n  = nums.length;

        for (int i = 0; i < n; i++) {

            if(nums[i] > nums[(i + 1) % n]){
                if(rotated)
                    return  false;
                else 
                    rotated = true;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        SortedAndRotated sortedAndRotated = new SortedAndRotated();
     boolean ans = sortedAndRotated.check(new int []{3,4,5,1,2});
     //boolean ans = sortedAndRotated.check(new int []{2,1,3,4});
        System.out.println(ans);
    }
}
