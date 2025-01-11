public class Subsets{
    public static void printSubsets(String str,String newStr,int idx){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        //yes choice
        printSubsets(str,newStr+str.charAt(idx),idx+1);
        //No choice
        printSubsets(str,newStr,idx+1);
    }
    public static void printPermutations(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutations(newStr, ans+currChar);
        }
    }
    public static void main(String [] args){
        String str ="abc";
        printSubsets(str,"",0); 
        printPermutations(str,"");
    } 
}
