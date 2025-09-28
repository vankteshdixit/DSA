package Queue;

import java.util.LinkedList;
import java.util.Queue;

//print all the elements present in given queue only using add(), remove() ,peek(), size() and extra queue
public class print {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
//        rear -> 5 4 3 2 1 -> front
        Queue<Integer> helper = new LinkedList<>();
        while (q.size() > 0){
            System.out.print(q.peek() + " ");
            helper.add(q.poll());
        }
        while (helper.size() > 0){
            q.add(helper.poll());
        }
    }
}
