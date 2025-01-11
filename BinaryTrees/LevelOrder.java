//level order ,count of nodes,sum of nodes,Diameter both approach
import java.util.*;
public class LevelOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        public static Node BuildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = BuildTree(nodes);
            newNode.right = BuildTree(nodes);
            return newNode;
        }
    }
    public static void levelOrder(Node root){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }
            else{
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }

    }
    public static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int left=countOfNodes(root.left);
        int right=countOfNodes(root.right);
        return left+right+1;
    }
    public static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    //Complexity O(n^2)
    public static int Diameter(Node root){
        if(root==null){
            return 0;
        }
        int leftD=Diameter(root.left);
        int rightD=Diameter(root.right);
        int rootD=leftD+rightD+1;
    
        return Math.max(rootD,Math.max(rightD, leftD));
    }
    //Complexity O(n)
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo Diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left=Diameter2(root.left);
        TreeInfo right=Diameter2(root.right);
        int myheight=Math.max(left.ht, right.ht)+1;
        int diam1=left.diam;
        int diam2=right.diam;
        int diam3=left.ht+right.ht+1;
        int mydiam= Math.max(diam3,Math.max(diam1,diam2));
        
        return new TreeInfo(myheight, mydiam);
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(nodes);
        System.out.println(Diameter2(root).diam);
    }

}
