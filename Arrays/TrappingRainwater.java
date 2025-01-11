public class TrappingRainwater{
    public static int totalWaterTrapped(int height[]){
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
        leftMax[0]=height[0];
        rightMax[rightMax.length-1]=height[rightMax.length-1];
        //calculate leftMax elements
        for(int i=1;i<leftMax.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        //calculate rightMax element
        for(int i=rightMax.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        //edge case 1
        if(height.length<=2){
            return 0;
        }
        int water_trapped=0;

        for(int i=0;i<height.length;i++){
            int water_level=Math.min(leftMax[i],rightMax[i]);
            water_trapped+=water_level-height[i];
        }
        return water_trapped;

    }
    public static void main(String [] args){
        int height[]={4,2,0,6,3,2,5};
        
        
        
        System.out.println(totalWaterTrapped(height));

    }
}
