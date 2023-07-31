package LinkedList;
import java.util.*;
public class Link {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList { 
        int count=0;
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            } 
            count++;
        }

        void insertAtBeg(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;

            } 
            count++;
        }

        void insertAt(int val, int idx) {
            Node temp = new Node(val);
            Node temp1 = head; 
            if(idx==0){ 
                insertAtBeg(val); 
            } 
            if(idx==count){ 
            }
            for (int i = 0; i < idx - 1; i++) {
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            temp1.next = temp; 
            count++;

        } 
        void delet(int val,int idx){    
            if(head==null){ 
                System.out.println("Linkedlist is empty");
            } 
            // if(idx>count){ 
            //     System.out.println("Your index is out of size of linkdlist");
            // }  
            // if(idx==0){ 
            //     head=head.next;
            //     tail=head.next;
            // } 
            if(idx==count){ 

            }
            Node temp=head;
            for(int i=0;i<idx-1;i++){ 
                temp=temp.next;
            } 
            temp.next=temp.next.next; 
            count--;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println("");
        }

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.insertAtBeg(11);
        ll.display();
        ll.insertAtBeg(13);
        ll.display();
        ll.insertAtBeg(12);
        ll.display();
        ll.insertAtBeg(13);
        ll.display();
        ll.insertAtBeg(14);
        ll.display();
        ll.insertAtBeg(15);
        ll.display();
        ll.insertAtEnd(12);
        ll.display();
        ll.insertAtEnd(13);
        ll.display();
        ll.insertAtEnd(14);
        ll.display();
        ll.insertAtEnd(15);
        ll.display();
        ll.insertAt(16, 1);
        ll.display(); 
        ll.delet(14, 2); 
        ll.display(); 
        ll.delet(23, 7);  
        ll.insertAt(43, 0); 
        ll.display(); 
        ll.insertAt(98,11);  
        ll.display();
    }

}
