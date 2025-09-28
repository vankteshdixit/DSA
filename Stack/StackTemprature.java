package Stack;

import java.util.Stack;

public class StackTemprature {
    public static void main(String[] args) {
        int arr[] = {73,74,75,71,69,72,76,73};
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int res[] = new int[n];
        for(int i = 0; i < n; i++){
            while(st.size() > 0 && arr[i] > arr[st.peek()]){
                int idx = st.pop();
                res[idx] = i - idx;
            }
            st.push(i);
        }
        for(int i = 0; i < n; i++){
            System.out.print(res[i]+" ");
        }
    }
}
