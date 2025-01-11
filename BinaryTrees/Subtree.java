public class Subtree {
    //level order ,count of nodes,sum of nodes,Diameter both approach
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
    public static boolean isIdentical(Node node,Node subroot){
        if(node==null &&subroot==null){
            return true;
        }
        else if(node==null || subroot==null || node.data!=subroot.data){
            return false;
        }
        if(!isIdentical(node.left, subroot.left)){
            return false;
        };
        if(!isIdentical(node.right, subroot.right)){
            return false;
        };
        return true;
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(root==null){
            return false;
        }
        if(root.data==subroot.data){
            if(isIdentical(root,subroot)){
                return true;
            }
        } 
        return isSubtree(root.left, subroot)||isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {
        //main tree
        Node root=new Node(1);
        root.left=new Node(2);
        root.left.right=new Node(5);
        root.left.left=new Node(4);
        root.right=new Node(3);
        root.right.right=new Node(6);
        //Sub tree
        Node subroot=new Node(2);
        subroot.left=new Node(4);
        subroot.right=new Node(5);
        System.out.println(isSubtree(root, subroot));
    }


    
}
