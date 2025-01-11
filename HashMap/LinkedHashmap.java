import java.util.LinkedHashMap;
public class LinkedHashmap {

    public static void main(String [] args){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<>();
        lhm.put("A", 100);
        lhm.put("C", 200);
        lhm.put("B", 300);
        System.out.println(lhm);
    }
}
