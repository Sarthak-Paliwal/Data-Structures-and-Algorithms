import java.util.ArrayList;

public class BuildTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
             this.data=data;
             this.left=null;
             this.right=null;
        }
    }
    //Creating a Binary Search Tree
    public static Node buildTree(int val, Node root){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=buildTree(val, root.left);
        }
        else{
            root.right=buildTree(val, root.right);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
        //Search A node in Binary Search tree
    public static void searchNode(int key, Node root){
        if(root==null){
            System.out.println("Element not found");
        }
        if(root.data==key){
            System.out.println("Element found");
        }
        else if(root.data<key){
            searchNode(key, root.right);
        }
        else{
            searchNode(key, root.left);
        }
    }
    //Delete A Node
    public static Node deleteNode(Node root,int val){
        if(root.data<val){
            root.right=deleteNode(root.right, val);
        }
        else if(root.data>val){
            root.left=deleteNode(root.left, val);
        }
        else{
            //case 1 leaf node
            if(root.left==null && root.right==null){
                return null;
            }
            //case 2 single child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
                // case 3 Two Childs
            Node IS=findInorderSuccessor(root.right);
            root.data=IS.data;
            deleteNode(root.right,IS.data);
            
        }
        return root;
    }
    //Finding inorder successor
    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }
    //Print Nodes in range
    public static void printInRange(Node root,int k1 ,int k2){
        if(root==null){
            return; 
        }
        if(root.data>=k1 && root.data<=k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data+" ");
            printInRange(root.right, k1, k2);
        }
        
        else if(root.data<k1){
            printInRange(root.right, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }
        
    }
      //Print root to leaf Path
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("NULL");
    }
  //calculating the path from root to leaf
    public static void printRootLeafPath(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null){
            printPath(path);
            
        }
        printRootLeafPath(root.left, path);
        printRootLeafPath(root.right, path);
        path.remove(path.size()-1);
    }
    //Validate a Binary Search Tree

    public static boolean isValidBst(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.data<=min.data){
            return false;
        }
        else if(max!=null && root.data>=max.data){
            return false;
        }
       
        return  isValidBst(root.left, min, root) && isValidBst(root.right, root, max);                                                        
    }
    //Mirror of a Binary Search tree
    public static Node mirrorBst(Node root){
        if(root==null){
            return null;
        }
        Node leftSubtree=mirrorBst(root.left);
        Node rightSubtree=mirrorBst(root.right);
        root.left=rightSubtree;
        root.right=leftSubtree;
        return root;
    }
    //Preorder sequence
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    //Sorted Array to Binary Search tree
    public static Node arrayToBalancedBst(int arr[],int st,int end){
        
        if(st>end){
            return null;
        }
        int mid=(st+end)/2;
        Node root=new Node(arr[mid]);
        root.left=arrayToBalancedBst(arr, st, mid-1);
        root.right=arrayToBalancedBst(arr, mid+1, end);
        return root;

    }

    public static void main(String []args){
        // int values[]={8,8,4,4,55,55};
        // Node root=null;
        // for(int i=0;i<values.length;i++){
        //     root=buildTree(values[i], root);
        // }
        // Node root=new Node(8);
        //  root.left=new Node(5);
        //  root.left.left=new Node(3);
        //  root.left.right=new Node(6);
        //  root.right=new Node(10);
        //  root.right.right=new Node(11);
        // root=mirrorBst(root);
        // preOrder(root);
       int arrSort[]={3,5,6,8,10,11,12};
       Node root=arrayToBalancedBst(arrSort, 0,arrSort.length-1);
       inorder(root);
        
    }
}
