import java.util.*;

public class FractionalKnapsack {
    public static void main(String [] args){
        int value[]={60,100,120};
        int weight[]={10,20,30};
        int maxWt=50;
        int ans=0;
        double ratio[][]=new double[value.length][2];
        for(int i=0;i<value.length;i++){
            ratio[i][1]=value[i]/(double)weight[i];
            ratio[i][0]=i;
        }
        Arrays.sort(ratio,Comparator.comparingDouble(o->o[1]));
        int capacity =maxWt;
        for(int i=ratio.length-1;i>=0;i--){
            int idx=(int)ratio[i][0];
            if(capacity>=weight[idx]){
                capacity-=weight[idx];
                ans+=value[idx];
            }
            else{
                ans+=ratio[i][1]*capacity;
                capacity=0;
                break;
            }
        }
        System.out.println(ans);
    }
}
