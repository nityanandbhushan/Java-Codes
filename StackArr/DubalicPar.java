package StackArr;  
import java.util.*;
public class DubalicPar{  
    public static boolean isValid(String str){ 
        Stack<Character> sb=new Stack<>();  
        for(int i=0;i<str.length();i++){  
            char ch=str.charAt(i); 
            if(ch==')'){ 
                int count=0;  
                while(sb.peek()!='('){ 
                    count++; 
                    sb.pop();
                } 
                if(count<1){ 
                    return true;
                } else{ 
                    sb.pop();
                }
            }else{ 
                    sb.push(ch);
            }
        } 
        return false;
    }
    public static void main(String args[]){ 
        String str="(a+b)"; 
        System.out.println(isValid(str));

    }
}