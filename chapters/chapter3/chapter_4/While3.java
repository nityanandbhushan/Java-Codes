package chapters.chapter3.chapter_4;
import java.util.*;
public class While3 {
     public static void main(String args[]){  
        Scanner sc= new Scanner(System.in); 
        System.out.println("enter the value where you till print the sum of natural numbers"); 
        int n=sc.nextInt(); 
        int i=0; 
        int sum=0; 
        while(i<=n){ 
            sum+=i; 
            i++;
        } 
        System.out.println(sum);

     }
}
