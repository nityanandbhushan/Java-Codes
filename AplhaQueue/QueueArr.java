package AplhaQueue;

public class QueueArr {
    public static class Queue {
        static int arr[];
        static int size;
        static int rare;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rare = -1;
        }

        public static boolean isEmpty() {
            return front == -1;
        }

        public static void add(int data) {
            if (rare == size - 1) {
                System.out.println("Queue is Full");
                return ;
            }
            rare++;
            arr[rare]=data;
            

        }

        public static int remove() {
            if(isEmpty()){ 
                System.out.println("Empty Queue");
                return -1;
            }

                int remV = arr[front];
            for (int i = 0; i < rare; i++) {
                arr[0] = arr[i + 1];
            }
            rare--;
            return remV;
        }
        public static int peek() {
            if(isEmpty()){ 
                System.out.println("Empty Queue");
                return -1;
            }
            int front1=arr[front];
            return front1;
        } 
        public static void printEl(){ 
            for(int i=0;i<rare;i++){ 
                System.out.print(arr[i]);
            } 
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Queue q = new Queue(6);
        q.add(90);
        q.add(80);
        q.add(70);
        q.add(60);
        q.printEl();
        // System.out.println(q.peek()); 
        // q.peek(); 
        // System.out.println(q.remove());
        // q.printEl();
        while(!q.isEmpty()){ 
            System.out.println(q.peek()); 
            q.remove();
            
        }

    }
}
