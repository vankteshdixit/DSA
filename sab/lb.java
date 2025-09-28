package sab;

public class lb {
    public static void main(String[] args) {
        int arr[] = {10,23,46,46,91,97,97,140,264};
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int lb = n;
        int x = 50;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=x) {
                lb = Math.min(lb,mid);
                hi = mid - 1;
            }
            else lo = mid + 1;
        }
        System.out.println(lb);
    }
}
