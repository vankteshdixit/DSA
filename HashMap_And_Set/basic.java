package HashMap_And_Set;

import java.util.HashSet;

public class basic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
//        Insert: TC : O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
//        size-> O(1)
        System.out.println(set.size());
        System.out.println(set);
//        search - true/false :TC->O(1)
        System.out.println(set.contains(10));
        set.add(20);
//        remove: -> O(1)
        set.remove(10);
        System.out.println(set);
        Object[] arr = set.toArray();
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
