public class Linkedlist{
    //Scratch code to linked list
    public static Node head;
    public static Node tail;
    public static int size;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
         } }
         //Adding element to the first of linked list 
        public void addFirst(int data){
            Node newNode=new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                
                return;
            }
            newNode.next=head;
            head=newNode;
        }
        //Adding elements at the middle 
        public void addMiddle(int idx,int data){
            if(idx==0){
                addFirst(data);
            }
            Node newNode = new Node(data);
            size++;
            int i=0;
            Node temp =head;
            while(i<idx-1){
                i++;
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        //Adding elements at the end
        public void addLast(int data){
            Node newNode = new Node(data);
            size++;
            if(head==null){
                head=tail=newNode;
                return; 
            }
            tail.next=newNode;
            tail=newNode;
            
        }
        //Removing elements from the beginning
        public void removeFirst(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            head=head.next;
            size--;
        }
        //Removing elements from the end
        public void removeLast(){
            //we can also create it of int type and return the deleted value
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            Node prev=head;
            while(prev.next!=tail){
                prev=prev.next;
            }
            prev.next=null;
            tail=prev;
            size--;
        }
        //Searching an element in the linked list using the iterative approach
        public int searchKey(int key){
            int i=0;
            Node temp=head;
            while(temp!=null){
                
                if(temp.data==key){
                    return i;
                }
                temp=temp.next;
                i++;
            }
            return -1;
        }
        //Search using the recursive approach by creating a helper function
        public int helper(Node head,int key){
            if(head==null){
                return -1;
            }
            if(head.data==key){
                return 0;
            }
            int idx=helper(head.next,key);
            if(idx==-1){
                return -1;
            }
            return idx+1;
        }
        public int recSearch(int key){
            return helper(head, key);
        }
        //Reversing a Linked List
        public void reverse(){
            Node prev=null;
            Node curr=tail=head;
            Node next;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
        //Printing the elements of the linked list
        public void printList(){
            if(head==null){
                System.out.println("Linked List is empty");
                return;
            }
           
            Node currNode=head;
            while(currNode!=null){
                System.out.print(currNode.data+" -> ");
                currNode=currNode.next;
            }
            System.err.print("null");
            System.out.println();
        }
        //Removing nth node from the end
        //nth node from end = size-n+1 th node from start
        public void removeNth(int n){
            int sz=0;
            Node curr=head;
            //calculate size
            while(curr!=null){
                curr=curr.next;
                sz++;
            }
            if(n==size){
                head=head.next;
                return;
            }
            int i=1;
            int idxtoFind=sz-n;
            Node prev=head;
            while(i<idxtoFind){//iterate to prev 
                prev=prev.next;
                i++;
            }
            prev.next=prev.next.next;
            return;

        }
        //Check Palindrome
        //1 find mid-> Slow Fast Approach
        public Node findMid(Node head){
            Node fast =head;
            Node slow=head;
            while(fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }    
            return slow; //it is the middle node
            } 
            //2 Check palindrome
            public Boolean checkPalindrome(){
                //to find mid
                //reverse second half
                //check left and right half
                if(head==null || head.next==null){
                    return true;
                }
                Node midNode=findMid(head);
                //reverse
                Node prev=null;
                Node curr=midNode;
                Node next;
                while(curr!=null){
                    next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                }
                Node right=prev;//right half head
                Node left=head;
                while(right!=null){
                    if(left.data!=right.data){
                        return false;
                    }
                    left=left.next;
                    right=right.next;
                }

                return true;
            }

    public static void main(String [] args){
        Linkedlist ll=new Linkedlist();
        ll.addFirst(0);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addFirst(2);
        // ll.addMiddle(3,1);
        ll.addLast(2);
        // ll.removeLast();
        // ll.printList();
        // ll.reverse();
        // ll.printList();
        
        // System.out.println(ll.searchKey(1));
        // System.out.println( ll.recSearch(0));
        System.out.println(ll.checkPalindrome());
    }
}