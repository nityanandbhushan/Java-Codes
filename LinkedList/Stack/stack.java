package LinkedList.Stack;
import java.util.Stack;


public class stack {
    public static void main(String args[]){ 
        Stack<Integer> st=new Stack<>();  
        
        //--------------------------------------Add element in the stack using loop ----------------------------------
        
        
        // int  n;
        // Scanner sc=new Scanner(System.in); 
        // System.out.println("Enter the size element of stack"); 
        //  n=sc.nextInt();
        //  for(int i=0;i<n;i++){  
        //     System.out.println("Enter the elements");
        //     int x=sc.nextInt();
        //     st.push(x);
        //  } 
        //  System.out.print(st);
        //  System.out.println("This is the peek element of the stack"+st.peek()); 

        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        System.out.println(st);
        reverPrint(st);
    }
        // st.pushAtBottom(st,990);



        //----------------------REVERSE A LINKEDLIST-------------------------------------
        // Stack<Integer> st1=new Stack<>();
        // while(st.size()>0){ 
        //     st1.push(st.peek());  
        //     st.pop();
        // }   
        // System.out.println(st);
        // Stack<Integer> st3=new Stack(); 
        // while(st1.size()>0){ 
        //     st3.push(st1.peek());
        //     st1.pop();
        // }
        // System.out.print(st3);
        //------------------------REVERSE A LINKEDLIST-----------------------------------


        //------------------------INSERT AT BOTTOM--------------------------------------- 
        // Stack<Integer> st3=new Stack<>();

        // while(st.size()!=0){ 
        //     st3.push(st.peek());
        //     st.pop();
        // } 
        // st.push(990); 
        // while(st3.size()!=0){ 
        //     st.push(st3.peek());
        //     st3.pop();
        // } 
        // System.out.println(st);
        //------------------------INSERT AT BOTTOM--------------------------------------- 
       
    
    // } 
    //  public static void pushAtBottom(Stack<Integer> st ,int val){ 
    //         if(st.isEmpty()){ 
    //             st.push(val);
    //             return ;
    //         } 
    //         int top=st.pop();
    //         pushAtBottom(st,val);
    //         st.push(top);
            

    //     } 
    //---------------------------REVERSE A STACK---------------------------------------------
    public static void reverPrint(Stack<Integer> s){ 
        if(s.isEmpty()){ 
            return ;

        } 
        int top=s.pop();
        reverPrint(s);



    }
    
}
