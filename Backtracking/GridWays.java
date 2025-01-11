public class GridWays{
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }
    public static int countWays(int i,int j,int m,int n){
        // if(i==m-1 && j==n-1){
        //     return 1;
        // }else if(i==m || j==n){
        //     return 0;
        // }
        //two choices
        //right
       
        return factorial(m+n-2)/(factorial(n-1)*factorial(m-1));//Mathematical way
    }
    public static void main(String [] args){
        int n=3;int m=3;
        System.out.println(countWays(0, 0, m, n));
    }
}