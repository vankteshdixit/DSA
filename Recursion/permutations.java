package Recursion;

import java.util.ArrayList;

public class permutations {
    public static void main(String[] args) {
        permu("","asd");
    }
    public static void permu(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.print(processed+",");
            return;
        }
        char ch = unprocessed.charAt(0);
        for(int i=0;i<=processed.length();i++){
            String f = processed.substring(0,i);
            String s = processed.substring(i,processed.length());
            permu(f+ch+s, unprocessed.substring(1));
        }
    }
    public static ArrayList<String> permutation(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int j=0;j<=p.length();j++){
            String first = p.substring(0,j);
            String second = p.substring(j,p.length());
            ans.addAll(permutation(first+ch+second, up.substring(1)));
        }
        return ans;
    }
    public static int permu1(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = unprocessed.charAt(0);
        for(int i=0;i<=processed.length();i++){
            String f = processed.substring(0,i);
            String s = processed.substring(i,processed.length());
            count = count + permu1(f+ch+s, unprocessed.substring(1));
        }
        return count;
    }
}
