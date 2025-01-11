import java.util.*;
public class StacksDeque {
    static class Stack{
        static Deque<Integer> stack=new LinkedList<>();
       
        public static void push(int data){
            stack.addLast(data);
        }
        public static int pop(){
            return stack.removeLast();
        }
        public static int peek(){
            return stack.getLast();
        }
       
    }
    static class Queue{
        static Deque<Integer> queue = new LinkedList<>();
        public static void add(int data){
            queue.addLast(data);
        }
        public static int remove(){
            return queue.removeFirst();
        }
        public static int peek(){
            return queue.getFirst();
        }
    }
    public static void main(String [] args){
        Stack s=new Stack();
        Queue q=new Queue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
    }
}
