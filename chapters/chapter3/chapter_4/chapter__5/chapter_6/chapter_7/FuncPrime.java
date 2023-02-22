package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;
import java.util.*;
public class FuncPrime 
{
    public static boolean primeNumber(int n)
    {  
        boolean result=true;
        for(int i=2;i<=n-1;i++)
        {  
            if(n%i==0)
            { 
                
                result=false; 
                break;
                
            }  

        } 
           return result;
    }
          public static void main(String args[])
    { 
     Scanner sc=new Scanner(System.in); 
     System.out.println("Enter the value of N"); 
     int n=sc.nextInt();  
     boolean result1=primeNumber(n); 
     System.out.println(result1);

    }
}
