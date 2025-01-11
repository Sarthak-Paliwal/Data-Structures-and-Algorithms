import java.util.*;
public class ZeroSumSubarray {
    public static void main(String []args){
        int arr[]={};
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int len=0;
        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(map.containsKey(sum)){
                len=Math.max(len, j-map.get(sum));
            }
            else{
                map.put(sum,j);
            }
        }
        System.out.println("length of largest subarray with sum 0 is:"+len);
    }
}
