package LinkedList;

public class Link {    
    public static void display(Node head){
        System.out.print(head.data +" ");
        head=head.next;
    }
    public static class Node {
        int data;  
        Node next;
        Node(int data)
        { 
            this.data=data;  
        }
    }
    public static void main(String args[]){  
        Node a=new Node(5);  
        Node b=new Node(6);  
        Node c=new Node(7); 
        Node d=new Node(8);  
        Node e=new Node(110);
        a.next=b; 
        b.next=c; 
        c.next=e;  
        e.next=d; 
        // System.out.println(e.data); 
        // System.out.println(e.next);
        // System.out.println(a.data);
        // System.out.println(a.next); 
        // System.out.println(b.data);  
        // System.out.println(b.next);  
        // System.out.println(c.data); 
        // System.out.println(c.next); 
        // System.out.println(d.data); 
        // System.out.println(d.next);   
        display(a); 
        Node temp=a;
        while(temp!=null){ 
            System.out.print(temp.data); 
            temp=temp.next;
        }


    } 
}