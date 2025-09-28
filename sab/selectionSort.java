package sab;

public class selectionSort {
    public static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {10,-4,20,1,-6,8};
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            int min=Integer.MAX_VALUE;
            int mindex =-1;
            for(int j=i;j<n;j++){
                if(arr[j]<min){
                    min=arr[j];
                    mindex = j;
                }
            }
//            swap arr[i] and arr[mindex]
            int  temp = arr[i];
            arr[i] = arr[mindex];
            arr[mindex] = temp;
        }
        print(arr);
    }
}
