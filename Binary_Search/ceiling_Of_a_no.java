package Binary_Search;

public class ceiling_Of_a_no {
    public static void main(String[] args) {
        int arr[] = {2,3,5,9,14,16,18};
        System.out.println(ceiling(arr, 15));
    }
    public static int ceiling(int arr[], int target){
        if(arr.length == 0) return 0;
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) {
                hi = mid - 1;
            }else if(arr[mid] < target){
                lo = mid+1;
            }
        }
        return arr[lo]; //for ceiling
//        return arr[hi];  for floor
    }
}
