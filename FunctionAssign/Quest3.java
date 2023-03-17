/* 
 * Write a Java program to check if a number is a palindrome in Java?(121isapalindrome, 321 is not)
 */
package FunctionAssign;

public class Quest3 { 
    public static int isPallindrome(int n){  
        int num=0;
        while(n>0){  
           int lastdig=n%10; 
            num=(num*10) + lastdig; 
            n=n/10;

        }  
        return num;
       
    }
    public static void main(String args[]){ 
        int n=121; 
       int number= isPallindrome(n); 
        if(number==n)
        { 
            System.out.println("Enter number is Pallindrome"); 
        } 
        else 
        { 
            System.out.println("Enter number is Not Pallindrome");
        }
    }
    
}
