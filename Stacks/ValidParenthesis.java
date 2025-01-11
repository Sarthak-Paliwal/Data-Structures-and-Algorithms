import java.util.*;
public class ValidParenthesis {
    public static boolean isvalid(String str){
       Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            //opening
            if(ch=='(' || ch=='[' || ch=='{'){
                s.push(ch);
            }
            else{
                //closing
                if(s.isEmpty()){//empty stack i.e. str=)))))))))
                    return false;
                }
                if((s.peek()=='('&& ch==')')
                || (s.peek()=='['&&ch==']')
                ||(s.peek()=='{'&&ch=='}')){
                    s.pop();
                }else{
                    return false;
                }
                }
            }
            if(!s.isEmpty()){
                return false;
        }
        return true;
    }
    public static void main(String[]args){
        String str="({})[]";
        System.out.println(isvalid(str));

    }
    
}
