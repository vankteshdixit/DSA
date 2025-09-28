package sab;

public class two {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
//    reverse the array
    public static void main(String[] args) {
        int arr[]={1,3,5,2,5,7,4};
        int n=arr.length;
//        for(int i=0;i<n/2;i++){
//            int j=n-i-1;
//            int temp=arr[i];
//            arr[i]=arr[j];
//            arr[j]=temp;
//
//        }
//        or
        int i=0;
        int j=n-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
