package LinkedList;
public class L {
    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        void addLast(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail=temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

        }  
        void addBeg(int val){ 
            Node temp= new Node(val);
            if(head==null){ 
                addLast(val);
            }  
            else{ 
                temp.next=head;
                head=temp;
            }

        }
        void display(){  
            Node temp=head;
            while(tail!=null){  
                System.out.print(temp.data+" "); 
                temp=temp.next;
            } 
            System.out.println(" ");
        } 

    } 
    public static void main(String args[]){ 
        LinkedList ll=new LinkedList();
        ll.addLast(89);
        ll.addLast(9); 
        ll.addLast(90); 
        ll.addLast(11); 
        ll.display(); 
        ll.addBeg(100);

    }

}
