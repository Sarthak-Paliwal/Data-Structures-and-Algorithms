import java.util.*;

public class Histogram{
    public static void histogramArea(int height[]){
        int maxArea=0;
        int nsl[]=new int[height.length];
        int nsr[]=new int[height.length];
        //next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=height.length-1;i>=0;i--){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=height.length;
            }
            else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s=new Stack<>();
        for(int i=0;i<height.length;i++){
            while(!s.isEmpty() && height[s.peek()]>=height[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }
            else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //calculate area
        for(int i=0;i<height.length;i++){
            int width=nsr[i]-nsl[i]-1;
            int area=width*height[i];
            if(area>maxArea){
                maxArea=area;
            }
        }
        System.out.println(maxArea);
    }
    public static void main(String [] args){
        int height[]={2,1,5,6,2,3};
        histogramArea(height);
    }
}
