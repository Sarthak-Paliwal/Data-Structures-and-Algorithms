public class Kadane{
    public static void kadanes(int arr[]){
        int cs=0;
        int ms=Integer.MIN_VALUE;
        //Checking if all elements are negative 
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                flag = true;
            }
            else{
                flag=false;
                break;
            }
        }
        if(flag==true){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>ms){
                    ms=arr[i];
                }
            }
            System.out.println(ms);
        }
        else{
            for(int i=0;i<arr.length;i++){
                cs=cs+arr[i];
                if(cs<0){
                    cs=0;
                }
                ms=Math.max(cs,ms);
            }
            System.out.println(ms);
        }
        
    }
    public static void main(String [] args){
        int arr[]={-1,-2,-3,-4};
        kadanes(arr);
    }
}