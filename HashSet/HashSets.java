import java.util.*;
public class HashSets {
    public static void main(String [] args){
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(2);
        set.add(5);
       //Iteration on HashSet
       //Using iterator interface
       Iterator it=set.iterator();
       while(it.hasNext()){
        System.out.println(it.next());
       }
       //Using  Enhanced for loop
       for(Integer i:set){
        System.out.println(i);
       }
       }
}
