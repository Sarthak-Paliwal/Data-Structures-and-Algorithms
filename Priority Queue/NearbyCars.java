import java.util.*;
public class NearbyCars {
static class Points implements Comparable<Points>{
    int x;
    int y;
    int distsq;
    int idx;
    public Points(int x,int y,int distsq,int idx){
        this.x=x;
        this.y=y;
        this.distsq=distsq;
        this.idx=idx;
    }
    @Override
    public int compareTo(Points p1){
        return this.distsq-p1.distsq;
    }

}
    public static void main(String [] args){
        int cars[][]={{3,3},{5,-1},{-2,4}};
        int k=2;
        PriorityQueue<Points> pq=new PriorityQueue<>();
        for(int i=0;i<cars.length;i++){
            int distsq=cars[i][0]*cars[i][0]+cars[i][1]*cars[i][1];
            pq.add(new Points(cars[i][0],cars[i][1],distsq,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
