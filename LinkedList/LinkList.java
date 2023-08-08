package LinkedList;

public class LinkList {
    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;
    static int count = 1;

    public void addFirst(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
            return;
        } else {
            temp.next = head;
            head = temp;
        }
        count++;

    }

    public void addLast(int val) {
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

    public void addMiddle(int val, int idx) {
        Node temp = new Node(val);
        Node temp1 = head;
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            for (int i = 0; i < idx - 1; i++) {
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            temp1.next = temp;

        }
        count++;

    }

    public int remFirst() {
        int val = head.data;
        if (head == null) {
            System.out.print("LinkedList is Empty");
            return Integer.MIN_VALUE;
        } else if (count == 1) {
            head = tail = null;
            return val;
        } else {
            head = head.next;
            count--;
        }
        return val;
    }
    public int remLast() {
        Node temp = head;
        if (head == null) {
            System.out.print("Linkedlist is Empty");
            return Integer.MIN_VALUE;
        } else if (count == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        } 
        for (int i = 0; i < count - 2; i++) {
                temp = temp.next;
            }
            int val=temp.next.data;
            temp.next= null;
            tail = temp; 
            count--; 
            return val; 
    } 
    public int SearchKey(int val){ 
        Node temp=head; 
        int i=0;
        while(temp!=null){ 
            if(temp.data==val){  
                return i;
                
            } 
            temp=temp.next;
            i++;
        } 
        return -1;

    }   
    public static int helperFunction(Node head,int val){ 
        if(head==null){ 
            return -1;
        } 
        if(head.data==val){ 
            return 0;
        }  
        int idx=helperFunction(head.next, val); 
        if(idx==-1){
            return -1;
        } 
        return idx+1;
    }
    public static int searchRecrVal(int val){ 
        return helperFunction(head,val);
    }

    public void removeNth(int val){ 
        Node temp=head;  
        if(val==count){ 
            head=head.next;
        }  
        int var=(count-val)-1;
        for(int i=0;i<var;i++){  
            temp=temp.next;
        } 
        temp.next=temp.next.next;

    } 
    

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public void sizeOfLink() {
        System.out.print(count);
    }

    public static void main(String args[]) {
        LinkList ll = new LinkList();
        ll.addFirst(89);
        ll.addFirst(90);
        ll.addFirst(67);
        ll.addLast(12);
        ll.addLast(13);
        ll.addLast(14);
        ll.display();
        ll.addMiddle(199, 2);
        ll.display();
        ll.removeNth(1); 
        ll.display(); 
        System.out.print(ll.searchRecrVal(12)); 
        
        
    }

}
