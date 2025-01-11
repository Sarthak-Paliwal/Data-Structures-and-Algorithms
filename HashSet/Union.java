import java.util.*;
public class Union {
    public static void findUnion(int arr1[],int arr2[]){
        HashSet<Integer> union=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            union.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            union.add(arr2[i]);
        }
        System.out.println(union.size());
        System.out.print(union);
    }
    public static void findIntersection(int arr1[],int arr2[]){
        HashSet<Integer> set1=new HashSet<>();
             for(int i=0;i<arr1.length;i++){
            set1.add(arr1[i]);
        }
        int count =0;
        for(int i=0;i<arr2.length;i++){
            if(set1.contains(arr2[i])){
                count++;
                
                set1.remove(arr2[i]);
            }
        }
        System.out.println(count);
    
    }
public static void main(String [] args){
int arr1[]={7,3,9};
int arr2[]={6,3,9,6,2,4};
// findUnion(arr1, arr2);
findIntersection(arr1, arr2);
}
}
