package LinkedList;

public class LinkKro {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        int count = 0;
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
            if (idx == count) {
                insertAtEnd(val);
            }
            if (head == null) {
                System.out.println("linkedList is empty");
            }
            for (int i = 0; i < idx - 1; i++) {
                temp1 = temp1.next;
            }
            temp.next = temp1.next;
            temp1.next = temp;
            count++;
        }
        void deleteNode(int val) {
            Node temp = new Node(val);
            temp.data = temp.next.data;
            temp.next = temp.next.next;
            count--;
        }
        Node deleteAt(int idx) {
            Node temp = head;
            int cout = 0;
            while (temp != null) {
                temp = temp.next;
                cout++;
            }
            int a = cout - idx + 1;
            for (int i = 1; i <= a - 1; i++) {
                temp = temp.next;
            }
            return temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(100);
        ll.insertAtEnd(13);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(12);
        ll.insertAtEnd(10);
        ll.display();
        System.out.println(ll.deleteAt(3));

    }
}
