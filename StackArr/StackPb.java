package StackArr;
import java.util.Stack;
public class StackPb {  
    public static void printAtBottom(Stack<Integer> s,int k){  
        if(s.size()==0){ 
            s.push(k); 
            return ;
        } 
        int top=s.peek();
        s.pop();
        printAtBottom(s, k); 
        s.push(top);

    } 
    public static void  printEle(Stack<Integer> s){  
        while(s.size()!=0){ 
            System.out.println(s.peek()); 
            s.pop();
        }

    } 
 
public static void main(String args[]){
Stack<Integer> s=new Stack<>();
s.push(1); 
s.push(2); 
s.push(3);
s.push(4);   
//printEle(s);
printAtBottom(s,8); 
printEle(s);
    
}

    
}
