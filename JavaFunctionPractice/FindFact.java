package JavaFunctionPractice;
import java.util.*;
public class FindFact {
    public static void factorial(int n){ 
        int fact=1; 
        for(int i=1;i<=n;i++){ 
            fact=fact*i;
        } 
        System.out.println(fact);
    }
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Value of N");
        int n=sc.nextInt(); 
        factorial(n);
    }
}
