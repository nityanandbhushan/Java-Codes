package Queue;
public class QueueEmpl {
    public static class QueEmpl {
        static int arr[] = new int[8];
        static int rare = -1;
        static int front = -1;

        public static void add(int data) {
            if (front == -1) {
                front++;
                rare++;
                arr[front] = data;
            } else {
                rare++;
                arr[rare] = data;
            }
        }  
        public static void peek(){ 
            System.out.print(" Front Element " + arr[front] );
            System.out.println();
        } 
        public static void remove(){ 
            System.out.print(" Removed Element " + arr[front]);
            System.out.println();
            front++;
        }
        public static void printEl(){ 
            for(int i=front;i<rare;i++)
            { 
              System.out.print(arr[i] + " ");
            }
             System.out.println();
        }
    }
    public static void main(String args[]) {
        QueEmpl q = new QueEmpl();
        q.add(90);
        q.add(23);
        q.add(12);
        q.add(85);
        q.add(98);
        q.add(84);
        q.printEl();
        q.peek();
        q.printEl();
        q.remove();
        q.printEl();
    }
}
