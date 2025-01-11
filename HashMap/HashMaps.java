import java.util.*;
public class HashMaps {
    public static Boolean atOrigin(String track){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('U',0);
        map.put('D',0);
        map.put('L',0);
        map.put('R',0);
        for(int i=0;i<track.length();i++){
            map.put(track.charAt(i),map.get(track.charAt(i)+1));
        }
        System.out.println(map);
        return (map.get('U')==map.get('D')&& map.get('L')==map.get('R'));
    }
    public static void main(String [] args){
        String track="UDLR";
        System.out.println(atOrigin(track));
    }
}
