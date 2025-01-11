import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class Interleave2halves {
    public static void printInterleave(Queue<Integer>Q){
        int size=Q.size();
        Queue<Integer> first=new LinkedList<>();
        for(int i=0;i<size/2;i++){
            first.add(Q.remove());
        }
        while(!first.isEmpty()){
            Q.add(first.remove());
            Q.add(Q.remove());
        }
    }
public static void main(String[] args){
    Queue<Integer> q=new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    q.add(4);
    q.add(5);
    q.add(6);
    q.add(7);
    q.add(8);
    q.add(9);
    q.add(10);
    printInterleave(q);
    System.out.println(q);
}

}
