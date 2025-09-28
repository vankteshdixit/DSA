package BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Traversals {
    static int n;
    private static void preorder(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
    private static void postorder(Node root){
        if(root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
    }
    private static void levelorder(Node root){
        Queue<Node> q = new ArrayDeque<>();
        if(root !=null) q.add(root);
        while(q.size() > 0){
//            DFS
            Node front = q.remove();
            System.out.print(front.val+ " ");
            if(front.left != null) q.add(front.left);
            if(front.right != null) q.add(front.right);
        }
    }
    private  static void nThLevel(Node root, int level){
//        DFS
        if(root == null) return;
        if(level == n) System.out.print(root.val+" ");
        nThLevel(root.left, level+1);
        nThLevel(root.right, level+1);
    }

    public static void main(String[] args) {
        Node a = new Node(1);// a is the root
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;

        preorder(a);
        System.out.println();
        inorder(a);
        System.out.println();
        postorder(a);
        System.out.println();
        levelorder(a);
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        nThLevel(a,0);
        System.out.println();
        System.out.println("DFS without using queue");
        for(int x = 0; x<=3; x++){
            n = x;
            nThLevel(a, 0);
            System.out.println();
        }
    }
}
