/* 
 * Question: WriteamethodnamedisEventhatacceptsanintargument The method should return 
 * true if the argument is even,or false otherwise.Also write a program to test your method
 */
package FunctionAssign;
import java.util.*;
public class Quest2 {
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
