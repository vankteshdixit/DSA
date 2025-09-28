package Stack;


public class LinkedListImplementationOfStack {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class LLStack {
        private Node head = null;
        private int size;

        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void displayrev(){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val+" ");
            }
            System.out.println();
            temp = temp.next;
        }
        void displayRec(Node h){
            if(h == null) return;
            displayRec(h.next);
            System.out.println(h);
        }
        void display(){
            displayRec(head);
        }
        int size(){
            return size;
        }
        int pop(){
            if(head == null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            return x;
        }
        int peek(){
            if(head == null){
                System.out.println("Stack is Empty");
                return -1;
            }
            return head.val;
        }
    }

    public static void main(String[] args) {
        LLStack st = new LLStack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        st.display();
        System.out.println(st.size());
        st.pop();
        st.display();
    }
}
