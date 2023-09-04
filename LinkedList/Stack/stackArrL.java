package LinkedList.Stack;

import java.util.ArrayList;
import java.util.Stack;

//--------------Implementation of stack using ArrayList---------------------------------
public class stackArrL {
    static ArrayList<Integer> st=new ArrayList<>(); 
     
    //chechk stack is EmptyOR not--------------------------------------
    public static boolean isEmpty(){ 
        return st.size()==0;

    } 
    // puch the data into the stack---------------------------------
    public static void push(int data){ 
        st.add(data);
    } 
    //pop the data from the stack-------------------------------------------
    public static int pop(){
        if(st.isEmpty()){ 
            return -1;
        } 
        int top=st.get(st.size()-1);
        st.remove(st.size()-1); 
        return top;
    } 
     
    // peek value(top up of the value of the stack--------------------
    public static int peek(){ 
        if(st.isEmpty()){ 
            return -1;
        }
        int peepValue=st.get(st.size()-1); 
        return peepValue;
    } 

    public static void main(String args[]){ 
        Stack s=new Stack(); 
        s.push(19); 
        s.push(28); 
        s.push(45); 
        s.push(54); 
        s.push(89);  
        System.out.println("Printing Stack item");
        System.out.println(s);
        System.out.println("After the pop operation"); 
        System.out.println(s.pop()); 
        System.out.println(s); 
        System.out.println("Peek value of stack");
        System.out.println(s.peek()); 

        while(!s.isEmpty()){ 
            System.out.print(s.peek()+" "); 
            s.pop();

        }

    }



    
}

