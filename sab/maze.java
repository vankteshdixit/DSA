package sab;

import java.util.Scanner;

public class maze {
    public static int mazePath(int row ,int col ,int m ,int n){

        if(col==n || row==m) return 1;
        if(row>m || col>n) return 0;
        int rightWays = mazePath(row,col+1,m,n);
        int downWays = mazePath(row+1,col,m,n);
        return rightWays+downWays;
    }

//    or

    public static int mazePath2(int m ,int n){
        if(m==1 || n==1) return 1;
        int rightWays = mazePath2(m,n-1);
        int downWays = mazePath2(m-1,n);
        return rightWays+downWays;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Enter the value of m:");
        int m = sc.nextInt();
//        System.out.println(mazePath(1,1,m,n));
        System.out.println(mazePath2(m,n));
    }
}
