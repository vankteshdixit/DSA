package Stack;

import java.util.Stack;

public class insertAtBottomOrAnyInx {

    public static void displayRec(Stack<Integer> s){
        s.push(5);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        displayRec(st);
        System.out.println(st);
//        Stack<Integer> rt = new Stack<>();
//        int idx = 2;
//        int x = 5;
//        while(st.size()>idx){
//            rt.push(st.pop());
//        }
//        st.push(x);
//        while(rt.size() > 0){
//            st.push(rt.pop());
//        }
//        System.out.println(st) ;


    }
}
