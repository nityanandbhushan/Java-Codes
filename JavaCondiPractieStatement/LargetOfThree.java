package JavaCondiPractieStatement;
import java.util.*;
public class LargetOfThree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the first number"); 
        int a =sc.nextInt(); 
        System.out.println("Enter the second number"); 
        int b =sc.nextInt(); 
        System.out.println("Enter the third number"); 
        int c=sc.nextInt();  
        if (a>b)
        { 
            if(a>c)
            { 
                System.out.println("A IS GREATER THAN OF THREES");
            } 
            else 
            {  
                System.out.println("C IS GREATER THAN OF THREES");
    
            }
        }
        else 
        { 
            if(b>c)
            { 
                System.out.println("B IS GREATER THAN OF THREES");
            }
        }
         
    } 
}
