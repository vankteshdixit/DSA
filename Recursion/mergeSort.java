package Recursion;

import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int [] arr = {8,3,4,12,5,6};
        arr = mergeSortArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] mergeSortArray(int[] arr){
        if(arr.length == 1) return arr;
        int mid = arr.length/2;
        int [] left = mergeSortArray(Arrays.copyOfRange(arr,0,mid));
        int [] right = mergeSortArray(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left, right);
    }
    public static int[] merge(int[] left, int[] right){
        int [] mix = new int[left.length+ right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i < left.length && j < right.length){
            if(left[i] < right[j]){
                mix[k] = left[i];
                i++;
            }else{
                mix[k] = right[j];
                j++;
            }
            k++;
        }
        while(j< right.length){
            mix[k] = right[j];
            k++;
            j++;
        }
        while(i<left.length){
            mix[k] = left[i];
            i++;
            k++;
        }
        return mix;
    }
}
