import java.awt.List;
import java.util.ArrayList;

public class AdvancedArrayList {
    //Brute force approach
    public static int containerWithMostWater(ArrayList<Integer> height,int maximum){
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                maximum=Math.max(maximum,ht*width);

            }
        }
        return maximum;

    }
    //Optimised using the two pointer approach
    public static int storeWater(ArrayList<Integer> height){
        int maxWater=0;
        int lp=0;
        int rp=height.size()-1;
        while(lp<rp){
            int ht=Math.min(height.get(lp),height.get(rp));
            int width=rp-lp;
            int currentWater=ht*width;
            maxWater=Math.max(currentWater,maxWater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxWater;
    }
    //pairsum in sorted array
    public static boolean pairSum(ArrayList<Integer> list,int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            else if(list.get(lp)+list.get(rp)>target){
                rp--;
            }
            else if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            
        }
        return false;
    }
    //pair sum in sorted rotated array
    public static boolean pairSum2(ArrayList<Integer> list2,int target){
        //find pivot point
        int bp=-1;
        for(int i=0;i<list2.size();i++){
            if(list2.get(i)>list2.get(i+1)){
                bp=i;
                break;
            }
        }
        int lp=bp+1;
        int rp=bp;
            while(lp!=rp){
            if(list2.get(lp)+list2.get(rp)==target){
                return true;
            }
            else if(list2.get(lp)+list2.get(rp)>target){
                rp=(rp+list2.size()-1)%list2.size();
            }
            else{
                lp=(lp+1)%list2.size();
            }
        }
        return false;
    }
    public static void main(String[]args){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);
        int maximum=0;
        // System.out.println(storeWater(height));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        // System.out.println(pairSum(list, 9));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(15);
        list2.add(6);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        System.out.println(pairSum2(list2, 16));




    }
    
}
