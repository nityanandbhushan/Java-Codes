package StackArr;
import java.util.Stack;
public class StackRvUs { 
    public static String printRever(String str){ 
        Stack<Character> s=new Stack<>(); 
        int i=0;
        while(i<str.length()){ 
            s.push(str.charAt(i)); 
            i++;
        } 
        StringBuilder sb=new StringBuilder(""); 
        while(s.size()!=0){ 
            char top=s.peek(); 
            sb.append(top); 
            s.pop();
        } 
        return sb.toString();
    }
    public static void main(String args[]){  
        String str="abc"; 
        String result=printRever(str); 
        System.out.println(result);
         


    }
}
