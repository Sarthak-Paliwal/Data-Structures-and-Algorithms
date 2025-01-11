import java.lang.reflect.Array;
import java.util.*;
public class IndianCoin {
    public static void main(String [] args){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        int amount=590;
        int count=0;
        Arrays.sort(coins,Comparator.reverseOrder());   
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<coins.length;i++){
            if(amount>=coins[i]){
                while(coins[i]<=amount){
                    ans.add(coins[i]);
                    count++;
                    amount-=coins[i];
                }
            }
        }
        System.out.println("Total min number of coins used are:"+count);
        System.out.println(ans);
    }
    
}
