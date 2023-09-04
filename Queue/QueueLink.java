package Queue;

import Queue.QueueLink.Node.queueLL;

public class QueueLink {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;

        }

        public static class queueLL {
            Node head = null;
            Node tail = null;
            int size = 0;

            public void add(int val) {
                Node temp = new Node(val);
                if (size == 0) {
                    head = tail = temp;
                } else {
                    tail.next = temp;
                    tail = temp;

                }
                size++;
            }

            public void peek() {
                if (size == 0) {
                    System.out.println("Queue is Empty");
                }
                System.out.println("peek el" + head.data);
            }

            public void remove() {
                if (size == 0) {
                    System.out.println("Queue is Empty");
                }
                System.out.println("remove el" + head.data);
                head = head.next;
                size--;
            }

            public void printEL() {
                Node temp = head;
                while (temp != null) {
                    System.out.print(temp.data + " " );
                    temp = temp.next;

                } 
                System.out.println();
            }
        }
    }

    public static void main(String args[]) {
        queueLL q = new queueLL();
        q.add(23);
        q.add(98);
        q.add(56);
        q.printEL();
        q.peek();
        q.remove();
        q.printEL();
    }
}
