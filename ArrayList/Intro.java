import java.util.ArrayList;
public class Intro{
    public static void main(String [] args){
        ArrayList<Integer> List = new ArrayList<>();
        //Basic Operations
        //Add Element
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println(List);
        // Get Element
        int element =List.get(2);
        System.out.println(element);
        // Remove Element
        List.remove(1);
        System.out.println(List);
        // Set Element at index
        List.set(1,2);
        System.out.println(List);
        // Contains element
        System.out.println(List.contains(3));
         

    }
    
}
