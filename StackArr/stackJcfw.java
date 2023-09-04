package StackArr;
import java.util.Stack;
public class stackJcfw { 

    public static void main(String args[]){  
        Stack<Integer> s=new Stack<>();
        s.push(69); 
        s.push(90); 
        s.push(91);
        s.pop();
        System.out.println(s.peek()); 
        while(!s.isEmpty()){ 
            System.out.println(s.peek()); 
            s.pop();
        }

    }

    
}
