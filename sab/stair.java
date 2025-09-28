package sab;

public class stair {

//    fund the no. of ways to reach nTh sab.stair if 1 or 2 jump at a time is allowed

    public static int stairPath(int n){
        if(n==1 || n==2) return n;
        return stairPath(n-1)+stairPath(n-2);
    }

    public static void main(String[] args) {
        System.out.println(stairPath(5));
    }
}
