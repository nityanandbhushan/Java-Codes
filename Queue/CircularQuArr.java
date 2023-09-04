package Queue;

public class CircularQuArr {
    public static class CircularQue {
        static int arr[] = new int[5];
        static int front = -1;
        static int rare = -1;

        public static void add(int data) {
            if (front == arr.length-1) {
                front = 0;
                arr[front] = data;
            }
            if (front == -1) {
                rare++;
                front++;
                arr[front] = data;
            } else {
                if (rare == arr.length-1) {
                    rare = 0;
                    arr[rare] = data;
                }
                rare++;
                arr[rare] = data;
            }
        }
        public static void peek() {
            System.out.println("peek"+arr[front]);
        }
        public static void remove() {
            System.out.println("remove"+arr[front]);
            front++;
        }
        public static void printEl() {
            for (int i = front; i <= rare; i++) {
                System.out.print(arr[i] + " ");
            } 
            System.out.println();
        }
    }
    public static void main(String args[]) {
        CircularQue q = new CircularQue();
        q.add(98);
        q.add(67);
        q.add(12);
        q.add(43);
        q.add(21);
        q.printEl();
        q.peek();
        q.remove();
        q.printEl();
        q.remove();
        // q.add(99);
        // q.add(100);
        q.printEl();




    }
}
