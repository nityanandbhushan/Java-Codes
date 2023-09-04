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
    //---------------------------Searching Element by Recursive---------Method one-------
    // public static int helperFunction(Node head,int val){ 
    //     if(head==null){ 
    //         return -1;
    //     } 
    //     if(head.data==val){ 
    //         return 0;
    //     }  
    //     int idx=helperFunction(head.next, val); 
    //     if(idx==-1){
    //         return -1;
    //     } 
    //     return idx+1;
    // }
    // public static int searchRecrVal(int val){ 
    //     return helperFunction(head,val);
    // } 


    //-----------------Searching by recursive-----------Method two-------------
    public  int searchRec(Node head,int val){  
        if(head==null){ 
            return -1;
        }   
        if(head.data==val){ 
            return 0;
        } 
        int idx=searchRec(head.next, val); 
        if(idx==-1){ 
            return -1;
        } 
        return idx+1;
    }  
    //----------------------------------reverse A LinkedList------------------------
    public void reverseLinkedlist(Node head){  
        Node curr=head; 
        Node prev=null; 
        while(curr!=null)
        { 
            Node temp=curr.next;
            curr.next=prev; 
            prev=curr;
            curr=temp;
        } 
       head =prev; 
       while(head!=null)
       { 
            System.out.print(head.data+" "); 
            head=head.next;   
        }
       

    } 
    // public void printReveLink(){ 
    //     Node lchead=reverseLinkedlist(head); 
    //     while(lchead!=null){ 
    //         System.out.print(lchead.data); 
    //         lchead=lchead.next;
            
    //     }
    // } 
    //------------------------Find and Remove from the last----------------------
    

    //-----------------------Check Pallindrome in linklist-----------------------

    //in this code use have slow fast approach
    public Node middleNode(Node head){   
        Node fast=head; 
        Node slow=head;
        while(fast!=null && fast.next!=null){   
            fast=fast.next.next;  
            slow=slow.next;
        }  
        return slow;
    } 

    public boolean isPallindrome(){ 
        if(head==null&& head.next==null){ 
            return true;
        }
        Node midNode=middleNode(head);
        Node curr=midNode; 
        Node prev=null; 
        while(curr!=null){ 
            Node temp=curr.next;  
            curr.next=prev;
            prev=curr;
            curr=temp;
        } 
        Node rightHead=prev;  
        Node leftHead=head;  
        while(rightHead!=null){ 
            if(leftHead.data!=rightHead.data){ 
                return false;
            } 
            leftHead=leftHead.next; 
            rightHead=rightHead.next;
        } 
        return true;
    } 
    //-------------------------------Detect a Loop/Cycle in a LL------------------------------------------
    public static boolean isCycle(Node head){  
        Node slow=head; 
        Node fast=head; 
        while(fast!=null && fast.next!=null){ 
            slow=slow.next; 
            fast=fast.next.next;
            if(fast==slow){ 
                return true;
            }
        } 
        return false;

    } 

    //---------------------------------Remove a Loop/Cycle in a LL---------------------------------------------
    public static void removeCycle(Node head){  
        Node slow=head; 
        Node fast=head; 
        boolean cycle=false;
        while(fast!=null && fast.next!=null){ 
            slow=slow.next; 
            fast=fast.next.next;
            if(fast==slow){  
                cycle=true;
                break;
                
            }
        }  
        if(cycle==false){
            return;
        }  
        slow=head;
        while(slow!=fast){ 
            slow=slow.next; 
            fast=fast.next;
        }
        slow.next=null;
       

    } 
    //-----------------------merge short on linkedlist--------------------------------------- 
    public Node linkMid(Node head){  
        Node slow=head; 
        Node fast=head.next;  
        while(fast!=null && fast.next!=null){  
            slow=slow.next;  
            fast=fast.next.next;
        }  
        return slow; 
    }  
    public Node merge(Node newLeft,Node newRight)
    { 
        Node mergeLL=new Node(-1);
        Node temp=mergeLL;
        while(newLeft!=null && newRight!=null){
            if(newLeft.data<=newRight.data){
                temp.next=newLeft; 
                newLeft=newLeft.next;
                temp=temp.next;
            }else{  
                temp.next=newRight; 
                newRight=newRight.next; 
                temp=temp.next;

            }

        } 
        while(newLeft!=null){ 
            temp.next=newLeft; 
            newLeft=newLeft.next; 
            temp=temp.next;
        } 
        while(newRight!=null){ 
            temp.next=newRight; 
            newRight=newRight.next; 
            temp=temp.next;
        }  
        return mergeLL.next;



    }
    public Node mergSort(Node head){   
        if(head==null || head.next==null){ 
            return head;
        } 
        //find mid
        Node mid=linkMid(head);  
        Node rightHead=mid.next; 
        mid.next=null; 
       Node newLeft= mergSort(head); 
       Node newRight= mergSort(rightHead);
       return merge(newLeft,newRight);
    }  


    //-----------------------ZIG-ZAG-LINKEDLIST------------------------------
     
 public Node findmid(Node head){ 
    Node slow=head; 
    Node fast=head.next; 
    while(fast!=null && fast.next!=null){ 
        slow=slow.next; 
        fast=fast.next.next;
    } 
    return slow;
 } 
 public Node reverseL(Node head){ 
    Node mid=findmid(head); 
    mid.next=null;
     Node curr=mid.next; 
     Node prev=null; 
     while(curr!=null){ 
        Node temp=curr.next; 
        curr.next=prev; 
        prev=curr; 
        curr=temp;
     } 
     return prev;
 
} 
public void altrMerg(){ 
    Node right=reverseL(head);
    Node left=head; 
    Node nextL,nextR;

    while(left!=null && right!=null){  
        nextL=left; 
        
        
    }


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
        ll.addFirst(3);
        ll.addFirst(19);
        ll.addFirst(21);
        ll.addFirst(11);
        ll.addLast(17); 
        ll.display();
        ll.head=ll.mergSort(ll.head);
        ll.display();

        // System.out.print(ll.searchRec(head,12)); 
        // ll.reverseLinkedlist(head); 

        //--------------------------this is for Cyclic Code-----------------------------------------
        // head=new Node(1); 
        // head.next=new Node(2); 
        // head.next.next=new Node(3); 
        // head.next.next.next=new Node(4); 
        // head.next.next.next.next=head.next.next;  
        // System.out.println(isCycle(head)); 
        // removeCycle(head);
        // System.out.print(isCycle(head));  

        //--------------------------this is for Cyclic Code----------------------------------------- 
    }

}
