package LinkedList;

public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
        }
    }

    public static class doublyLinkedlist {
        public static Node head = null;
        public static Node tail = null;
        public static int count=0;

        public void addfirst(int data) {
            Node temp = new Node(data);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
                head.prev = head;
            }  
            count++; 
        }  
        public void addLast(int data){ 
            Node temp=new Node(data); 
            //Node temp=head; 
            tail.next=temp;
            tail=temp;
            tail.prev=tail;


        } 
        public void remFirst(){ 
            //Node temp=head; 
            // temp.next.next=temp.next.next; 
            // temp=temp.next; 
            head=head.next;
            head.prev=null;
            count--;
 

        }
        
        public void remLast(){ 
            Node temp=head;  
            // while(temp!=null){   
            //     temp=temp.next;
            // } 
            for(int i=0;i<count-2;i++){ 
                temp=temp.next;
            }
            temp.next=null;
            tail=temp; 
        } 
        //----------------------------Reverse LinkedList------------------------------
        public void reverDll(){  
            Node temp=head;
            while(temp!=null){  
                System.out.print(temp.prev.data); 
                temp=temp.prev;
                
            }
        }   
        
        
        
        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } 
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        doublyLinkedlist dll = new doublyLinkedlist();
        dll.addfirst(1);
        dll.addfirst(12);
        dll.addfirst(13);
        dll.addfirst(14);
        dll.addfirst(15);
        dll.remLast();
        dll.display(); 
        dll.remFirst();
        dll.display();
        dll.addLast(99);
        dll.display();
        dll.reverDll();
    }

}
