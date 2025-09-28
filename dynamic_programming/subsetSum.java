package dynamic_programming;

public class subsetSum {
    public static boolean subset(int i, int sum, int arr[], int target){
        if(i==arr.length){
            if(sum==target) return true;
            else return false;
        }
        boolean pick=subset(i+1,sum+arr[i],arr,target);
        boolean skip=subset(i+1,sum,arr,target);
        return pick || skip;
    }
    public static void main(String[] args) {
        int arr[]={8,5,2,4};
        int target=9;
        System.out.println(subset(0,0,arr,target));
    }
}
