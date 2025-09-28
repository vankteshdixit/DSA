package Heap;
class MinHeap{
    private int arr[];
    private int size;
    MinHeap(int capacity){
        arr = new int[capacity];
        size = 0;
    }
    public void add(int num){
        arr[size++] = num;
        upheapify(size-1);
    }
    public int peek(){
        if(size == 0){
            System.out.println("Heap is Empty!!");
            return -1;
        }
        return arr[0];
    }
    public void upheapify(int idx){
        if(idx == 0) return;
        int parent = (idx-1)/2;
        if(arr[idx] < arr[parent]){
            swap(idx, parent);
            upheapify(parent);
        }
    }
    public void swap(int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int size(){
        return size;
    }
}
public class minHeapImplementationBYArray {
    public static void main(String[] args) {
        MinHeap pq = new MinHeap(10);
        pq.add(1);
        pq.add(6);
        pq.add(2);
        System.out.println(pq.size());
    }
}
