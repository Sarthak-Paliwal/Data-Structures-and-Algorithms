import java.util.*;
public class maxLengthChain {
    public static void main(String [] args){
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs,Comparator.comparingDouble(o->o[1]));
        int chainLen=1;//Always select the first activity\
        int pairEnd=pairs[0][1];//last selected pair end / chain end 
        for(int i=1;i<pairs.length;i++){
            if(pairs[i][0]>pairEnd){
                chainLen++;
                pairEnd=pairs[i][1];
            }
        }
        System.out.println(chainLen);
        
    }
}
