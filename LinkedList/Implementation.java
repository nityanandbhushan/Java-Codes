package LinkedList;

public class Implementation {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node lemp = head;
            while (lemp != null) {
                System.out.print(lemp.data + " ");
                lemp = lemp.next;
            }
            System.out.println(" ");

        }

        int size() {
            int count = 0;
            Node temp = head;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count; 
        } 
         

        void insertAtBegn(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head.next = temp;
                head = temp;
            } else {

                temp.next = head;
                head = temp;

            }

        } 
        void insertAt(int idx,int val){ 
            Node t=new Node(val);  
            Node temp=head;
            for(int i =1;i<=idx-1;i++){   
               temp=temp.next; 
            }    
            t.next=temp.next; 
            temp.next=temp;

        }

    }

    public static void main(String args[]) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(7);
        ll.insertAtEnd(8);
        ll.display();
        System.out.print("Size of linkedlist is" + ll.size());
        System.out.println("");
        ll.insertAtBegn(90);
        ll.display(); 
         System.out.println("");
        ll.insertAt(2,10); 
       

    }

}
