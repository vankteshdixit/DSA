package sab;

public class skip {
//    sab.skip a character in string

    public static void skip(int i,String s,String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if(s.charAt(i)!='a') ans+=s.charAt(i);

        skip(i+1,s,ans);
    }

    public static void main(String[] args) {
        String s = "Raghav Garg";
        skip(0,s,"");
    }
}
