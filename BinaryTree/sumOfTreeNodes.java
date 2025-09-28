package BinaryTree;

public class sumOfTreeNodes {
    private static void display(Node root){
        if(root == null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int sum(Node root){
        if(root == null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    private static int product(Node root){
        if(root == null) return 1;
        return root.val * product(root.left) * product(root.right);
    }
    private static int max(Node root){
        if(root == null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a,Math.max(b,c));
    }
    private static int min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a,Math.min(b,c));
    }
    private static int size(Node root){
        if(root == null) return 0;
        return 1+size(root.left)+size(root.right);
    }
    private static int level(Node root){
        if(root == null) return 0;
        return 1+Math.max(level(root.left),level(root.right));
    }
    public static void main(String[] args) {
        Node a = new Node(1);// a is the root
        Node b = new Node(4);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.right = f;
        display(a);
        System.out.println(sum(a));
        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(size(a));
        System.out.println(level(a));
    }
}
