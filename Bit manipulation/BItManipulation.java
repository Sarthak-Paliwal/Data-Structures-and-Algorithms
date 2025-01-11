import java.util.*;
class BItManipulation{
    //EVEN ODD USING BIT MANIPULATION
    //logic the lsb of a odd number is 1 so we perform and operation with 1 so,
    //if a number is odd the number becomes 1 else number becomes 0
    public static void PrintEvenOdd(int n){
        if((n & 1)==1){
            System.out.println("Given Number is Odd");
        }
        else{
            System.out.println("Given Number is Even");
        }
    }
    public static void getIthBit(int n,int i){
        int bitmask=1<<i;
        if((n & bitmask)==0){
            System.out.print("ith bit is Zero");
        }
        else{
            System.out.println("ith bit is One");
        }
    }
    public static int setIthBit(int n,int i){
        int bitMask=1<<i;
        return bitMask | n;
    }
    public static int clearIthBit(int n,int i){
        int bitMask=~(1<<i);
        return n & bitMask;
    }
    public static int UpdateIthBit(int n,int i,int updateVal){
        if(updateVal==1){
            return setIthBit(n, i);
        }
        else{
            return clearIthBit(n, i);
        }
    }
    public static int ClearlastIth(int n,int i){
        int bitmask=((~0)<<i);
        return n & bitmask;
    }
    public static int clearRangleOfBits(int n,int i, int j){
        int bitMask=(((~0)<<j+1)|(1<<i)-1);
        return n & bitMask;
    }
    public static int countSetBit(int n){
        int count=0;
        while(n!=0){
            if((n & 1)!=0){
                count++;
            }
            n=n>>1;

        }
        return count;
    }
    public static int fastExponentiation(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
          }
          a=a*a;  
          n=n>>1;
         
        }
        return ans;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        // // PrintEvenOdd(n);
    //     int i=sc.nextInt();
    //     int j=sc.nextInt();
    //     // getIthBit(n, i);
    //     // System.out.println(setIthBit(n, i));
    //     // System.out.println(clearIthBit(n, i));
    // // System.out.println(UpdateIthBit(n, i, 1));
    //     System.out.println(clearRangleOfBits(n, i, j));
    System.out.println(countSetBit(10));

    }
}