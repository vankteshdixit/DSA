package Stack;

import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
//         Reverse Order
        Stack<Integer> rt = new Stack<>();
        while(st.size() > 0){
//            int x = st.peek();
//            rt.push(x);
//            st.pop();

//            or

            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> ct = new Stack<>();
        while(rt.size() > 0){
            ct.push(rt.pop());
        }
        System.out.println(ct);

    }
}
