package sab;

public class bubble {
    public static void print(int arr[]){
        for(int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[]={3,1,2,5,4};
        int n = arr.length;

        for (int x=0;x<n-1;x++){
            boolean flag =true;
            for (int i=0;i<n-1-x;i++){
                if(arr[i]<arr[i+1]) {
                    swap(arr,i,i+1);
                    flag = false;
                }
            }
            if (flag==true) break;
        }
        print(arr);

    }
}
