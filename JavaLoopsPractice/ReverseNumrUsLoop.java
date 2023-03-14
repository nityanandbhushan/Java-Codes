package JavaLoopsPractice;
import java.util.*;
public class ReverseNumrUsLoop {
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the four digit number"); 
        int n=sc.nextInt(); 
        int rev=0;
        for(int i=0;i<n;i++){   
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit; 
            n=n/10; 
        } 
        System.out.println("Reverse Number is "+ rev);
    }
}
