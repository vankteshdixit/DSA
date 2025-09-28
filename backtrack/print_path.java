package backtrack;

import java.util.ArrayList;

public class print_path {
    public static void main(String[] args) {
        path("",3,3);
        System.out.println();
        System.out.println(pathArray("",3,3));
        System.out.println();
        System.out.println(pathAllPlusDiagonally("",3,3));
    }
    public static void path(String p,int r, int c){
        if(r==1 && c==1){
            System.out.print(p+",");
            return;
        }
        if(r>1){
            path(p+'D', r-1, c);
        }
        if(c>1){
            path(p+'R', r,c-1);
        }
    }
    public static ArrayList<String> pathArray(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> l=new ArrayList<>();
        if(r>1){
            l.addAll(pathArray(p+'D',r-1,c));
        }
        if(c>1){
            l.addAll(pathArray(p+'R',r,c-1));
        }
        return l;
    }
    public static ArrayList<String> pathAllPlusDiagonally(String p, int r, int c) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> l = new ArrayList<>();
        if(r>1 && c>1){
            l.addAll(pathAllPlusDiagonally(p+ 'd', r-1, c-1));
        }
        if (r > 1) {
            l.addAll(pathAllPlusDiagonally(p + 'D', r - 1, c));
        }
        if (c > 1) {
            l.addAll(pathAllPlusDiagonally(p + 'R', r, c - 1));
        }
        return l;
    }
}
