package Algorithm;

public class duchFlag {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2,0,0,0,0,0,1,1,2,2,2};
        int n = arr.length;
        int lo = 0;
        int mid = 0;
        int hi = n-1;
        while (mid <= hi){
            if(arr[mid] == 0){
                swap(arr,lo,mid);
                mid++;
                lo++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                swap(arr,mid,hi);
                hi--;
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
