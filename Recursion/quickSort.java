package Recursion;

import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int [] nums, int lo, int hi){
        if(lo>hi) return;
        int s=lo;
        int e=hi;
        int m= s+(e-s)/2;
        int pivot = nums[m];
        while(s<=e){
            //also a reason why if its already sorted it will not swap
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp = nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
//        now pivot is at correct idx now sort
        sort(nums,lo,e);
        sort(nums,s,hi);
    }
}
