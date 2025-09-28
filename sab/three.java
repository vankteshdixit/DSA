package sab;

public class three {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void reverse(int arr[],int i,int j){
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int arr[]={13,4,73,2,5,83};
        int n= arr.length;
        int k=2;
        k=k%n;
        int rotate[]=new int[n];
        for(int i=0;i<n;i++){
            rotate[i]=arr[(i+(n-k))%n];
        }
        for(int ele:rotate){
            System.out.print(ele+" ");
        }
    }
}
