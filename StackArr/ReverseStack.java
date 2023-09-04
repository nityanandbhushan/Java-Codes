package StackArr;
import java.util.Stack;
public class ReverseStack {  
    public static void pushAtBttm(Stack<Integer> s,int top){ 
        if(s.size()==0){ 
            s.push(top); 
            return;
        }  
        top=s.pop(); 
        pushAtBttm(s, top);
        s.push(top);
    }  
    public static void reverseStack(Stack<Integer> s){ 
        if(s.size()==0){ 
            return;
        } 
        int top=s.pop(); 
        reverseStack(s); 
        pushAtBttm(s, top);
    } 
    public static void printElement(Stack<Integer> s){  
          while(s.size()!=0){ 
            System.out.print(s.pop());
        } 

    }
    public static void main(String args[]){ 
        Stack<Integer> s=new Stack<>(); 
        s.push(1); 
        s.push(2); 
        s.push(3); 
        s.push(4);
        printElement(s);
        reverseStack(s);  
        printElement(s);
    }
    
}
