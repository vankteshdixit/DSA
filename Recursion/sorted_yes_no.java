package Recursion;

public class sorted_yes_no {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5,6};
        System.out.println(sortedYesNo(arr,0));
    }
    public static boolean sortedYesNo(int arr[], int idx){
        if(idx == arr.length-1) return true;
        return arr[idx] < arr[idx+1] && sortedYesNo(arr, idx+1);
    }
}
