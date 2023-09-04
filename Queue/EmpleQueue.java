package Queue;

import java.util.*;

public class EmpleQueue {
    public static void printEl(Queue<Integer> q) {
        Queue<Integer> q1 = new LinkedList<>();
        int len = q.size();
        for (int i = 0; i < len; i++) {
            System.out.print(q.peek());
            // q1.add(q.peek());
            q.remove();
        }

    }

    public static void main(String args[]) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        printEl(q);
    }
}