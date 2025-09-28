package sliding_window;
//maximum sub array of size k
public class que1 {
//    brute force method
//    public static void main(String[] args) {
//        int arr[] = {10,20,1,3,-40,80,10};
//        int k = 2;
//        int n = arr.length;
//        int maxSum = 0;
//        for(int i = 0; i < n-k+1; i++){
//            int sum = 0;
//            for(int j=i;j<i+k;j++){
//                sum = sum+arr[j];
//            }
//            maxSum = Math.max(sum, maxSum);
//        }
//        System.out.println(maxSum);
//    }

    public static void main(String[] args) {
        int arr[] = {10,20,1,3,-40,80,10};
        int n = arr.length;
        int k = 2;
        int i = 0;
        int j = k-1;
        int sum = 0;
        for(int x=i;x<k;x++){ //0(k)
            sum = sum+arr[x];
        }
        i++;
        j++;
        int maxSum = 0;
        while(j<n){ //n-k times
            sum = sum - arr[i-1] + arr[j];
            maxSum = Math.max(maxSum,sum);
            i++;
            j++;
        }
        System.out.println(maxSum);
//        T.C = O(n)
    }
}
