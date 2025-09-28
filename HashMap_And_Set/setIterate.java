package HashMap_And_Set;

import java.util.HashSet;

public class setIterate {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
        s.add(20);
        s.add(100);
        s.add(10);
        s.add(-8);
        s.add(200);
        for(int ele : s){
            System.out.print(ele+" ");
        }
    }
}
