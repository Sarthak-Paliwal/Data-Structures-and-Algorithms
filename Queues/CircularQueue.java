public class CircularQueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front=-1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front==-1;
        }
        public static boolean isFull(){
             return (rear+1)%size ==front;
        }

        // Add Function
        public static void enqueue(int data) {
            if (isFull()) {
                System.err.println("Queue is Full");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear] = data;
            
        }

        // remove Function
        public static int Dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            front=(front+1)%size; //we now only need to update the front to the next element
            if(rear==front){
                rear=front=-1;
            }
            return result;
        }

        // Peek Function
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int result = arr[front];
            return result;
        }

        public static void printQueue() {
            for (int i = 0; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }

        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(8);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.Dequeue());
        System.out.println(q.peek());
        q.printQueue();
    }
}
