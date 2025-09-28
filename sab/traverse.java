package sab;

public class traverse {
//    Array traversal

    public static void print(int i,int []arr){
        if(i==arr.length) return;
        System.out.print(arr[i]+" ");
        print(i+1,arr);
    }

    public static void main(String[] args) {
        int arr[]={3,35,4,2,23,5};
        int n= arr.length;
        print(0,arr);
    }
}
