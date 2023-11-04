package com.dsa.array.basic;

public class SecondLargestAndSmallest {
    public static int[] getSecondOrderElements(int n, int []a) {
        // Write your code here.

        int secondLargest = secondLargest(a);
        int secondSmallest = secondSmallest(a);
        int[] ans  = new int[2];
        ans[0] = secondLargest;
        ans[1] = secondSmallest;
        return ans;
    }

    private static int secondLargest(int[] a){

        int largest = a[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {

            if(a[i] > largest){
                slargest = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > slargest){
                slargest = a[i];
            }
        }
        return slargest;
    }

    private static int secondSmallest(int[] a){

        int smallest =a[0];
        int ssmallest = Integer.MAX_VALUE;
        for (int i = 1; i < a.length; i++) {

            if(a[i] < smallest){
                ssmallest = smallest;
                smallest = a[i];
            } else if (a[i] > smallest && a[i] < ssmallest){
                ssmallest = a[i];
            }
        }
        return ssmallest;
    }

    public static void main(String[] args) {

        int [] res = getSecondOrderElements(5, new int[] {1,2,3,4,5});


        for (int re : res) {
            System.out.println(re);
        }
    }
}