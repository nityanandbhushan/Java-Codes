/*  
 * Question 4:WriteaJavaprogramthattakesayearfromtheuserandprintwhetherthatyear is a leap year or no
 */
package JavaConditionStatement;
import java.util.*;
public class AssFourQues { 
    public static void main(String args[]){ 
        Scanner sc= new Scanner(System.in);  
        System.out.println("Enter the Year"); 
        int year=sc.nextInt(); 
        if(year % 4 == 0) 
        {  
            if(year % 100 == 0) 
            { 
                if(year % 400 == 0) 
                {  
                    System.out.println("Enter year is a  leap Year"); 

                }
            } 
        } 
        else { 
            System.out.println("Enter year is not leap Year");
        }

    }
    
}
