package Linear_Search;

public class linear {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6};
        System.out.println(linearSearch(arr,8));
    }
//      Search in the array return the idx if item found
    public static int linearSearch(int[] arr, int target){
        if(arr.length==0){
            return -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}
