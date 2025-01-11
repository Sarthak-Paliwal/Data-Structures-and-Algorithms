import java.util.ArrayList;
import java.util.Collections;
public class BasicQuestions {
    public static void Swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        System.out.println(list);
    }
    public static void printReverse(ArrayList<Integer> list){
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
    }
    public static int findMax(ArrayList<Integer> list,int maximum){
        //Max Value
        // max=Math.max(Max,list.get(i)) It also gives same result
        for(int i=0;i<list.size();i++){
                if(list.get(i)>maximum){
                    maximum=list.get(i);
                }
            }
            return maximum;
    }
        public static void main(String [] args){
        ArrayList<Integer> list=new ArrayList<>();
        int maximum=Integer.MIN_VALUE;
        list.add(1);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(5);
        list.add(6);       
        printReverse(list);
        System.out.println("Maximum Value: "+findMax(list, maximum));
        Swap(list, 1, 3);
        //List before Sorting
        System.out.println("Unsortred "+list);
        //sorting
        Collections.sort(list);
        //After Sorting
        System.out.println("sortred "+list);

        
    }
    
}
