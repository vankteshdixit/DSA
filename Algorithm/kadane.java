package Algorithm;

public class kadane {
    public static int maxSubArraySum(int arr[]){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];

            if(maxSum < sum){
                maxSum = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArraySum(arr));
    }
}
