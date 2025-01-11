import java.util.*;
public class InsertHeap {
    static class Heap{
        ArrayList<Integer> arr=new ArrayList<>();
        public void Insert(int data){
            //Add at last index
            arr.add(data);
            //Fix the heap
            int cld=arr.size()-1;
            int par=(cld-1)/2;
            while(arr.get(cld)<arr.get(par)){
                //swap
                int temp=arr.get(cld);
                arr.set(cld,arr.get(par));
                arr.set(par,temp); 
                cld=par;
                par=(cld-1)/2;
            }
        }
        public int peek(){
            return arr.get(0);
        }
        private void Heapify(int i){
            int minIdx=i;
            int left=2*i+1;
            int right=2*i+2;
            if(left<arr.size()&& arr.get(left)<arr.get(minIdx)){
                 minIdx=left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx=right;
            }
            if(minIdx!=i){
                int temp=arr.get(i);
                arr.set(i,arr.get(minIdx));
                arr.set(minIdx,temp);
                Heapify(minIdx);
            }
        }
        public int remove(){
            int data=arr.get(0);
            //Swap the First and Last index
             int temp=arr.get(0);
             arr.set(0,arr.get(arr.size()-1));
             arr.set(arr.size()-1,temp);
             arr.remove(arr.size()-1);
             Heapify(0);
             return data;
        }
        public boolean isEmpty(){
            return arr.size()==0;
        }
    }
    public static void main(String [] args){
        Heap h=new Heap();
        h.Insert(2);
        h.Insert(3);
        h.Insert(4);
        h.Insert(5);
        h.Insert(10);
        h.Insert(1);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
        
    }
}
