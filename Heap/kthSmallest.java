package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallest {
    public static void main(String[] args) {
        int arr[] = {10, 2, 3, 8, -4, -2, 6};
        int n = arr.length;
        int k = 3;
//        minHeap
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for(int i = 0; i < n; i++){
//            pq.add(arr[i]);
//        }
//        System.out.println(pq);
//        for(int i = 0; i < k-1; i++){
//            pq.remove();
//        }
//        System.out.println(pq);
//        System.out.println(pq.peek());

//        MaxHeap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < n; i++){
            pq.add(arr[i]);
            if(pq.size() > k){
                pq.remove();
            }
        }
        System.out.println(pq.peek());
    }
}
