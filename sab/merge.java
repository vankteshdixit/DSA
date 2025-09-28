package sab;//sab.merge sab.two sorted array

public class merge {
    public static void main(String[] args) {
        int a[]={1,3,5,7};
        int b[]={2,4,6,8,86};
        int c[]=new int[a.length+b.length];
        int i=a.length-1;
        int j=b.length-1;
        int k=c.length-1;
        while(i>=0 && j>=0){
            if(a[i]>=b[j]){
                c[k]=a[i];
                i--;
            }
            else{
                c[k]=b[j];
                j--;
            }
            k--;
        }
//        if(i==a.length){
//            while (j>0){
//                c[k]=b[j];
//                j--;
//                k--;
//            }
//        }
//        if(j==b.length){
//            while (i>0){
//                c[k]=a[i];
//                i--;
//                k--;
//            }
//        }
        while (i >= 0) {
            c[k--] = a[i--];
        }

        // Copy remaining elements from array `b`
        while (j >= 0) {
            c[k--] = b[j--];
        }
        for(int ele:c){
            System.out.print(ele+" ");
        }
    }
}
