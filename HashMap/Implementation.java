import java.util.*;
public class Implementation {
    static class HashMap<K,V>{//Generic Type User defined Type
        private class Node{
            K key;
            V value;
            public Node(K key,V value){
                this.key=key;
                this.value=value;
            }
        }
        private int n;//n
        private int N;
        private LinkedList<Node> buckets[];//N for normal array we write // private int arr[] which says we are 
    //storing int type of data in array here LinkedList specifies we are storing LL inside the array
        @SuppressWarnings("unchecked")
        public HashMap(){
            this.N=4;
            //creating an array of size 4
            this.buckets=new LinkedList[4];
            //creating a new LL at each index
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }
        private int hashFunction(K key){
            int hc=key.hashCode();
            return Math.abs(hc) % N;//for size 4 the modulo gives value ranging from 0 to 3
        }
        private int SearchinLL(K key,int bi){
          LinkedList<Node> ll=buckets[bi];
          int di=0;
          for(int i=0;i<ll.size();i++){
            Node node=ll.get(i);
            if(key==node.key){
                return di;
            }
            di++;
          }
          return -1;
        }
        @SuppressWarnings("unchecked")
        private void rehash(){
            LinkedList<Node> oldbucket[]=buckets;
            buckets=new LinkedList[N*2];
            N=N*2;
            for(int i=0;i<buckets.length;i++){
                buckets[i]=new LinkedList<>();
            }
            //nodes->add
            for(int i=0;i<oldbucket.length;i++){
                LinkedList<Node> ll=oldbucket[i];
                for(int j=0;j<ll.size();j++){
                    Node node=ll.remove();
                    put(node.key,node.value);
                }
            }
        }
        public void put(K key,V value){
            int bi=hashFunction(key);//bucket index
            int di=SearchinLL(key,bi);//data index->two cases valid index and -1 if key doesn't exists already
            if(di==-1){
                //no key exists 
                buckets[bi].add(new Node(key, value));
                n++;

            }
            else{
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){
                rehash();
            }
        }
        public boolean containsKey(K key){
            int bi=hashFunction(key);
            int di=SearchinLL(key, bi);
            if(di!=-1){
                return true;
            }
            else{
                return false;
            }
            
        }
        public V get(K key){
            int bi=hashFunction(key);
            int di=SearchinLL(key, bi);
            if(di!=-1){
                Node node=buckets[bi].get(di);
                return node.value;
            }else{
                return null;
            }
        }
        public V remove(K key){
            int bi=hashFunction(key);
            int di=SearchinLL(key, bi);
            if(di!=-1){
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }else{
                return null;
            }
        }

    }
    public static void main(String [] args){
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("a",100);
        hm.put("b",200);

    }
}
