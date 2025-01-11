public class LinkedListImplementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Queue{
        static Node head=null;
        static Node tail=null;
        public static boolean isEmpty(){
            return head==null && tail==null;           
        }
        public static void Enqueue(int data){
            Node newNode=new Node(data);
            if(head==null){
                head=tail=newNode;
            }
            tail.next=newNode;
            tail=newNode;
        }
        public static int Dequeue(){
            if(isEmpty()){
                System.out.println("queue is Empty");
                return -1;
            }
            if(tail==head){
                int result =head.data;
                tail=head=null;
                return result;
            }
            int result =head.data;
            head=head.next;
            return result;
        }
        public static int peek(){
            return head.data;
        }
        public static void printQueue(){
            if(head==null){
                System.out.println("Queue is Empty");
            }
            Node currNode=head;
            while(currNode!=null){
                System.out.println(currNode.data);
                currNode=currNode.next;
                
            }
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.Enqueue(1);
        q.Enqueue(2);
        q.Enqueue(3);
        q.Enqueue(4);
        q.Enqueue(5);
        q.Enqueue(6);
        q.Enqueue(7);
        System.out.println("dequeue"+q.Dequeue());
        System.out.println("peek"+q.peek());
        q.printQueue();

    }
}
