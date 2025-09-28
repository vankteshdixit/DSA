package sab;//Find the second largest element in the given array


public class one {
    public static void main(String[] args) {
        int[] arr={10,78,2,4,6,43,8};
        int mx=Integer.MIN_VALUE;
        for (int k : arr) {
            if (k > mx) {
                mx = k;
            }
//            or
//            mx=Math.max(mx,arr[i]);
        }
        System.out.println(mx);

        int smx=Integer.MIN_VALUE;
        for (int i : arr) {
            if (i != mx)
                smx = Math.max(smx, i);
        }
        System.out.println(smx);
    }
}
