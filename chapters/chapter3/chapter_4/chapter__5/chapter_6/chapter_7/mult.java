package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;

import java.util.*;

public class mult {

    /**
     * @param a
     * @param b
     */
    public static void multiply(int a, int b){
        int mult = a * b;
        System.out.println(mult);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of A & B ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        multiply(a, b);
    }

}
