package Recursion;

public class String_reverse {
    public static void main(String[] args) {
        System.out.println(reverse("CARS"));
        print1ton(4);
        subSets(0,"abc","");
    }
    public static String reverse(String s){
        if(s.length() <= 1) return s;
        return reverse(s.substring(1))+s.charAt(0);
    }
    public static void print1ton(int n){
        if(n==0) return;
        print1ton(n-1);
        System.out.print(n+" ");
    }
    public static void subSets(int i, String s, String ans){
        if(i == s.length()) {
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(i);
        subSets(i+1,s,ans+ch);
        subSets(i+1, s, ans);
    }
}
