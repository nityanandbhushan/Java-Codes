/*
 * Question1:WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
 */
package JavaConditionStatement;
import java.util.*;
public class AssFirstQues { 
    public static void main(String args[]){  
        Scanner sc= new Scanner(System.in);  
        System.out.println("Enter the number"); 
        int a =sc.nextInt();  
        if(a<0){ 
            System.out.println("Enter number is negative"); 
        } 
        else 
        { 
            System.out.println("Enter number is positive");
        }


        

    } 
    
}
