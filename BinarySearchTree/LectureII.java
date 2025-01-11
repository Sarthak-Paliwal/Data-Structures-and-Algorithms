import java.util.*;
public class LectureII {
static class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
}
//preorder sequence
public static void preOrder(Node root){
    if(root==null){
        return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
}
public static void getInOrder(Node root,ArrayList<Integer> inOrder){
    if(root==null){
        return ;
    }
    getInOrder(root.left, inOrder);
    inOrder.add(root.data);
    getInOrder(root.right, inOrder); 
}
public static Node BalancedBst(ArrayList<Integer> inOrder,int st,int end){
    if(st>end){
        return null;
    }
    int mid=(st+end)/2;
    Node root=new Node(inOrder.get(mid));
    root.left=BalancedBst(inOrder, st,mid-1);
    root.right=BalancedBst(inOrder, mid+1, end);
    return root;
}
//Balancing the Bst
public static Node balancedBinarySearchTree(Node root){
    //inorder Sequence
    ArrayList<Integer> inOrder=new ArrayList<>();
    getInOrder(root, inOrder);
    //Create Balanced BST
    root =BalancedBst(inOrder, 0, inOrder.size()-1);
    return root;    
}
public static void main(String [] args){
    Node root=new Node(8);
    root.left=new Node(6);
    root.left.left=new Node(5);
    root.left.left.left=new Node(3);
    root.right=new Node(11);
    root.right.right=new Node(12);
    root.right.left=new Node(10);
    root=balancedBinarySearchTree(root);
    preOrder(root);
}
}
