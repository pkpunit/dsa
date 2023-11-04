package com.dsa.array.medium;

import java.util.Arrays;

public class NextPermutations {

    public void nextPermutation(int[] numbers) {
        int ind1=-1;
        int ind2=-1;
        // step 1 find breaking point
        for(int i=numbers.length-2;i>=0;i--){
            if(numbers[i]<numbers[i+1]){
                ind1=i;
                break;
            }
        }
        // if there is no breaking  point
        if(ind1==-1){
            reverse(numbers,0);
        }

        else{
            // step 2 find next greater element and swap with ind2
            for(int i=numbers.length-1;i>ind1;i--){
                if(numbers[i]>numbers[ind1]){
                    ind2=i;
                    break;
                }
            }

            swap(numbers,ind1,ind2);
            // step 3 reverse the rest right half
            reverse(numbers,ind1+1);
        }
    }
    void swap(int[] numbers,int i,int j){
        int temp=numbers[i];
        numbers[i]=numbers[j];
        numbers[j]=temp;
    }
    void reverse(int[] numbers,int start){
        int i=start;
        int j=numbers.length-1;
        while(i<j){
            swap(numbers,i,j);
            i++;
            j--;
        }
    }
}
