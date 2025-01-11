public class DivideNConquer {
    public static void minMaxElement(int arr[],int s,int e){
        int min,max;
        if(s==e){
            //single element 
             max=arr[s];
             min=arr[e];
        }
        else if(s+1==e){
            if(arr[s]<arr[e]){
                min=arr[s];
                max=arr[e];
            }
            else{
                min=arr[e];
                max=arr[s];
            }
        }
        else{
            int mid=s+(e-s)/2;
            int leftMinMax[2]=minMaxElement(arr,s,mid);
            int rightMinMax[2]=minMaxElement(arr,mid+1,e);
            if(leftMinMax[0]>rightMinMax[0]){
                max=leftMinMax[0];

            }
            else{
                max=rightMinMax[0];
            }
            if(leftMinMax[1]<rightMinMax[1]){
                min=rightMinMax[1];

            }
            else{
                min=leftMinMax[1];
            }
        }
        int output[2]={max,min};
        System.out.println(output[0]+" "+output[1]);
        

    }
    public static void main(String [] args){
        int arr[]={12,32,43,4,5,67,87};
        minMaxElement(arr,0,arr.length-1);
    }
}
