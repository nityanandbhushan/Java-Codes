package chapters;
import java.util.*;
public class Helloo {
    public static void main(String args[]){  
    Scanner sc = new Scanner(System.in);   
        System.out.print("ENTER THE FIRST VALUE");
        int a = sc.nextInt(); 
        System.out.print("ENTER THE SECOND VALUE"); 
        int b = sc.nextInt();  
        System.out.print("ENTER THE SECOND VALUE"); 
        int c = sc.nextInt();
        float avg=a+b+c/3;  

        System.out.println("sum of a and b is" +avg);
    }
}
