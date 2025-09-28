package sab;

import java.util.Scanner;

public class fib {

    public static int fibo(int n){
        if(n<=1) return n;
        int ans = fibo(n-1)+fibo(n-2);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
}
