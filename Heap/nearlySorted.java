package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class nearlySorted {
    public static void main(String[] args) {
        int arr[] = {6, 5, 3, 2, 8, 10, 9};
        int n = arr.length;
        int k = 3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                ans.add(pq.remove());
            }
        }
        while(pq.size() > 0){
            ans.add(pq.remove());
        }
        System.out.println(ans);
    }
}
