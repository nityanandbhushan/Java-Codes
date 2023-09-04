package LinkedList.Stack;

//-------------------Stack Implementation using LinkedList
public class stackLinKlist {
    public static class Node{ 
        int data; 
        Node next; 
        public Node(int data){ 
            this.data=data;
            this.next=null;
        }
    } 
    static class Stack{ 
        static Node head=null; 
         
        //Checking static is empty or not--------------------
        public static boolean isEmpty(){ 
            return head==null;
        } 


        //puch element into the stack
        public static void pushEle(int val){ 
            Node temp=new Node(val); 
            if(isEmpty()){ 
                head=temp; 
                return;
            } else{ 
                temp.next=head;
                head=temp; 
            }
            
        } 
        //Pop Function into the stack
        public static int popO(){ 
            if(isEmpty()){ 
                return -1;
            }
            int top=head.data; 
            head=head.next; 
            return top;
        } 
        //Peek 
        public static int peek(){  
            if(isEmpty()){ 
                return -1;
            }
            return head.data;
        } 

        
    }
   

    
}
