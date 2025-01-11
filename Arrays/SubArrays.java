public class SubArrays {
    public static void PrintSubarrays(int arr[]){
        int sum=0;
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    sum=sum+arr[k];
                }
                System.out.println();
                 System.out.println("sum="+sum);
               
                if(sum<smallest){
                    smallest=sum;
                }
                if(sum>largest){
                    largest=sum;
                }
                 sum=0;
               
            }
            System.out.println();
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
    public static void main(String []args){
        int arr[]={2,4,6,8,10};
        PrintSubarrays(arr);
    }
    
}
