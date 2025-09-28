package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class sizeMaxSumHeight {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
    public static int size(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a = root.val;
        int b= max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b,c));
    }
    public static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a = root.val;
        int b= max(root.left);
        int c = max(root.right);
        return Math.min(a, Math.min(b,c));
    }
    public static int height(Node root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
//    level=height+1
    public static void nthLevel(Node root, int n){
        if(root==null) return;
        if(n==1) {
            System.out.println(root.val + " ");
            return;
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }
    public static int sum(Node root){
        if(root==null) return 0;
        return root.val+ sum(root.left)+ sum(root.right);
    }
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        if(root!=null) q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            if(temp.left!=null) q.add(temp.left);
            if(temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        b.right=e;
        System.out.print(size(root));
        System.out.println();
        System.out.print(sum(root));
        System.out.println();
        System.out.print(max(root));
        System.out.println();
        System.out.println(height(root));
        System.out.println();
//        int level = height(root)+1;
//        for (int i=0;i<=level;i++){
//            nthLevel(root,i);
//        }
//        O(nlogn)
        bfs(root);
    }
}
