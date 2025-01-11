import java.util.Arrays;
public class Arrayb {
    public static int[] twosum(int arr[],int tar){
        int lp=0;
        int rp=arr.length-1;
        int res[]={};
        while(lp<rp){
            
            if(arr[lp]+arr[rp]==tar){
                res[0]=lp;
                res[1]=rp;
                return res;
            }
            if(arr[lp]+arr[rp]<tar){
                lp++;
            }
            else{
                rp--;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int arr[]={3,2,4};
        System.err.println(twosum(arr, 6));
    }
    
}
