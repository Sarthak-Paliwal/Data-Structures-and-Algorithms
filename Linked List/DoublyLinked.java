public class DoublyLinked {
    public static Node head;
    public static Node tail;
    public static int size;
    public  static class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public void removeFirst(){
        if(head==null){
            System.err.println("List is Empty");
        }
        if(size==1){
            head=tail=null;
            size--;
        }
        head.prev=null;
        head=head.next;
        size--;
    }
    public void reverse(){
        Node curr = head;
        Node prev=null;
        Node next;
        while (curr!=null) {
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("List is Empty");
        }
        if(size==1){
            head=tail=null;
            size--;
            return;
        }
        Node secondlast=head;
        while(secondlast.next!=tail){
            secondlast=secondlast.next;
        }
        tail.prev=null;
        tail=secondlast;
        secondlast.next=null;
        
        
    }
    public void printList(){
        Node Curr=head;
        while(Curr!=null){
            System.out.print(Curr.data+"<->");
            Curr=Curr.next;
        }
        System.out.println("null");
    }
    public static void main(String [] args){
        DoublyLinked dl=new DoublyLinked();
        dl.addFirst(1);
        dl.addFirst(2);
        dl.addFirst(3);
        dl.addFirst(4);
dl.printList();
        dl.reverse();
        dl.removeLast();
        dl.printList();
    }
    
}
