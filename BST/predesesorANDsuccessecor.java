package BST;

import com.sun.source.tree.Tree;

import javax.swing.tree.TreeCellRenderer;
import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val = val;
    }
}
public class predesesorANDsuccessecor {
    static TreeNode predecessor;
    static TreeNode successor;
    static ArrayList<Integer> arr = new ArrayList<>();

    public static void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
    }

    public static void PreSucc(int key){
        int pre = -1;
        int suc = -1;
        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == key){
                if(i-1 >= 0) pre = arr.get(i-1);
                if(i+1 < arr.size()) suc = arr.get(i+1);
                break;
            }
        }
        System.out.println("Key: " + key);
        System.out.println("Predecessor: " + (pre == -1 ? "None" : pre));
        System.out.println("Successor: " + (suc == -1 ? "None" : suc));
    }

    public static void findPreSucc(TreeNode root, int key){
        if(root == null) return;
        if(root.val == key){
            if(root.left != null){
                TreeNode temp = root.left;
                while (temp.right != null){
                    temp = temp.right;
                }
                predecessor = temp;
            }
            if(root.right != null) {
                TreeNode temp = root.right;
                while (temp.left != null) {
                    temp = temp.left;
                }
                successor = temp;
            }
        }
        else if (key < root.val) {
            successor = root;
            findPreSucc(root.left, key);
        }
        else {
            predecessor = root;
            findPreSucc(root.right, key);
        }
    }
    public static void displayInorder(TreeNode root){
        if(root == null) return;
        displayInorder(root.left);
        System.out.print(root.val+" ");
        displayInorder(root.right);
    }
    public static void main(String[] args) {
        TreeNode a = new TreeNode(50);
        TreeNode b = new TreeNode(30);
        TreeNode c = new TreeNode(70);
        TreeNode d = new TreeNode(20);
        TreeNode e = new TreeNode(40);
        TreeNode f = new TreeNode(60);
        TreeNode g = new TreeNode(80);

        a.left = b; a.right = c;
        b.left = d; b.right = e;
        c.left = f; c.right = g;
        displayInorder(a);
        System.out.println();
        inorder(a);
//        int key = 60;
//        findPreSucc(a, key);
//        System.out.println("Predecessor: " + (predecessor != null ? predecessor.val : "None"));
//        System.out.println("Successor: " + (successor != null ? successor.val : "None"));
        int key = 70;
        PreSucc(key);
    }
}
