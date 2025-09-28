package Recursion;

//public class count_no_of_zeros {
//    static int count = 0;
//    public static void main(String[] args) {
//        System.out.println(zero(30204));
//    }
//    public static int  zero(int n){
//        if(n%10 == n) return count;
//        if(n%10 == 0){
//            count++;
//        }
//        return zero(n/10);
//    }
//}

public class count_no_of_zeros {
    public static void main(String[] args) {
        System.out.println(zeros(30204, 0));
    }
    public static int zeros(int n, int count){
        if(n%10==n) return count;
        if(n%10==0){
            return zeros(n/10, count+1);
        }
        return zeros(n/10, count);
    }
}
