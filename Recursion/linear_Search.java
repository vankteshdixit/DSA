package Recursion;

public class linear_Search {
    public static void main(String[] args) {
        int arr[] = {1,2,5,3,4};
        System.out.println(search(arr, 4, 0));
    }
    public static boolean search(int arr[], int target, int idx){
        if(idx == arr.length) return false;
//        if(arr[idx] == target){
//            return true;
//        }
//        return search(arr, target, idx+1);
        return arr[idx]==target || search(arr, target, idx+1);
    }
}
