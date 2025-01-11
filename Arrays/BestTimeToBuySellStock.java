public class BestTimeToBuySellStock {
    public static int maxProfitFromStock(int price[]){
        int buy_price=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<price.length;i++){
            if(buy_price<price[i]){//profit
                int profit=price[i]-buy_price;
                maxProfit=Math.max(maxProfit,profit);
            }
            else{
                buy_price=price[i];
            }
        }
        return maxProfit;
    }
    public static void main(String [] args){
        int price[]={7,1,5,3,6,4};
        System.out.println(maxProfitFromStock(price));
    }

}
