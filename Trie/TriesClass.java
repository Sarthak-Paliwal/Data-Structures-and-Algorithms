public class TriesClass {
    static class Node{
        Node children[]=new Node[26];
        boolean eow;
        Node(){
            for(int i=0;i<children.length;i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node(); 
    public static void insert(String word){
        Node curr = root;
        for(int lvl=0;lvl<word.length();lvl++){
            char ch=word.charAt(lvl);
            if(curr.children[ch-'a']==null){
                curr.children[ch-'a']=new Node();
            }    
            curr=curr.children[ch-'a'];
        }
        curr.eow=true;
    }
    public static boolean Search(String key){
        Node curr=root;
        for(int i=0;i<key.length();i++){ 
            char ch=key.charAt(i);
            int idx=ch-'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr=curr.children[idx];
        }
        
        return curr.eow==true;
    }
    public static boolean wordBreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String s1=key.substring(0, i);
            String s2=key.substring(i);
           if(Search(s1)&&wordBreak(s2)){
            return true;
           }
            
        }
        return false;
    }
    
    public static void main(String [] args){
        String words[]={"i","like","sam","samsung","mobile","ice"};
        for(String word:words){
            insert(word);
        }
        String key="ilikesamsung";
        System.out.println(wordBreak( key));
    }
}
