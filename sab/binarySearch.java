package sab;

public class binarySearch {

    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10,15,21,34,81,105,180,500};
        int n = arr.length;
        int target = 105;
        int lo=0;
        int hi =n-1;
        boolean flag = false;
//        for(int i=0;i<=n;i++)
        while (lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target){ flag=true; break;}
            else if(arr[mid]<target) lo=mid+1;
            else hi=mid-1;
        }
        if(flag==true) System.out.println("find");
        else if(flag==false) System.out.println("not found");
    }
}
