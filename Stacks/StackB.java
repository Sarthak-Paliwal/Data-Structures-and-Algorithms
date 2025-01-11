import java.util.ArrayList;
public class StackB {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>(); 
        public  boolean isEmpty(){
            if(list.size()==0){
                return true;
            }
            return false;
        }
        public  void push(int data){
            list.add(data);
        }
        public  int pop(){
            if(isEmpty()==true){
                System.out.println("Stack Empty");
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        public  int peek(){
            int top=list.get(list.size()-1);
            return top;
        }

    } 

    public static void main(String[] args){
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek()); 
            s.pop();
        }


    }
    
}
