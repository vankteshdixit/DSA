package Recursion;

public class dice {
    public static void main(String[] args) {
        diceComb("", 4);
    }
    public static void diceComb(String p, int target){
        if(target==0){
            System.out.print(p+",");
            return;
        }
        for(int i=1;i<=6 && i<=target;i++){
            diceComb(p+i, target-i);
        }
    }
}
