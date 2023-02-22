package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;
import java.util.*;
public class pyq2 { 
    public static void isEven(int in){ 
        if(in % 2==0)
        { 
            System.out.println("Enter number is Even");
        } 
        else 
        { 
            System.out.println("Enter number is Odd");
        }
    } 

    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in); 
        System.out.println("enter the number"); 
        int in=sc.nextInt(); 
        isEven(in); 

    }
}
