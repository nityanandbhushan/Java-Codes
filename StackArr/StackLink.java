package StackArr;

public class StackLink {
    static public class Node{ 
        int data; 
        Node next; 
        public Node(int data){ 
            this.data=data; 
            this.next=null;
        }
    } 
    static public class stack{
        static Node head=null; 
        public static boolean isEmpty(){ 
            return head==null;
        }  
        //push  
        public static void  push(int data){  
            Node temp=new Node(data); 
            if(isEmpty()){ 
                 head=temp;
                 return;

            }else{ 
                temp.next=head; 
                head=temp;
            }
           
        }
        //pop 
        public static int pop(){ 
            int top=head.data; 
            head=head.next; 
            return top;
        }
        //peek  
        public static int peek(){ 
            return head.data;
        } 
        //printElement 
        public static void printElement(){ 
            while(head!=null){ 
                System.out.println(head.data);
                head=head.next;
            }
        }


    }   
    public static void main (String args[]){  
        stack s=new stack(); 
        System.out.println(s.isEmpty()); 
        s.push(89);
          s.push(9);
            s.push(8); 
              s.push(76); 
              s.printElement(); 
              System.out.println(s.pop());


 

    }


    
}
