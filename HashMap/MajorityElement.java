import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int nums[] = { 1, 2 };
        int freq = (nums.length) / 3;
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        for(Integer key:map.keySet()){
            if(map.get(key)>=freq){
                System.out.println(key);
            }
        }
    }

}
