import java.util.*;
public class ActivitySelection{

    public static void main(String [] args){
        int start[]={10,12,20};
        int end[]={20,25,30};
        //here activities are already sorted based on their end time
        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity will be always selected as it will end too soon so that we have time to perform further activities
        maxAct=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd=end[i];
            }
        }
        System.out.println("Maximum activity that can be performed= "+maxAct);

        System.out.println("Activities performed are:");
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
    }
}