public class PracticeQuestions {
    public static int findKey(int arr[], int key, int idx){
        if(idx==arr.length){
            return -1;
        }
        if(arr[idx]==key){
            return idx;
        }
        return findKey(arr,key,idx+1);
    }
    public static int findLength(String str, int idx,int len){
        
        

    }
    public static void main(String [] args){
        int arr[]={1,4,6,78,9,76,3,46,8,9,8};
        int key=46;
        System.out.println(findKey(arr,key,0));
    }
}
