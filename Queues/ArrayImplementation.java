public class ArrayImplementation {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        // Add Function
        public static void enqueue(int data) {
            if (rear == size - 1) {
                System.err.println("Queue is Full");
                return;
            } else {
                rear++;
                arr[rear] = data;
            }
        }

        // remove Function
        public static int Dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        // Peek Function
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            return front;
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