import java.util.*;

public class WeakestSoldier {
    static class WeakestSold implements Comparable<WeakestSold> {
        int soldCount;
        int idx;

        WeakestSold(int soldCount, int idx) {
            this.soldCount = soldCount;
            this.idx = idx;
        }

        @Override
        public int compareTo(WeakestSold w1) {
            if (this.soldCount == w1.soldCount) {
                return this.idx - w1.idx;
            }else{
                return this.soldCount - w1.soldCount;
            }
            
        }

    }

    public static void main(String[] args) {
        int army[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 1, 1 },
                         { 1, 0, 0, 0 },
                         { 1, 0, 0, 0 } };
        PriorityQueue<WeakestSold> pq=new PriorityQueue<>();
        for(int i=0;i<army.length;i++){
            int count=0;
            for(int j=0;j<army[i].length;j++){
                count+=army[i][j]==1?1:0;
            }
            pq.add(new WeakestSold(count, i));
        }
        for(int i=0;i<pq.size();i++){
            System.out.println("row"+pq.remove().idx);
        }
    }
}
