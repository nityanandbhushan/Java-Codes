package JavaFunctionPractice;
import java.util.*;
public class BinDecCon {
    public static int  BinDec(int bin)
    {  
        int pow=0; 
        int dec=0;
        
         while(bin>0) 
         //for(lastdig;i++) 
          { 
            int lastdig=bin%10; 
            dec = dec + (lastdig * ((int)Math.pow(2,pow)));  
            pow++;
         } 
            return dec;

    }
 
    public static void main(String args[])
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the Number in Binary"); 
        int bin = sc.nextInt();  
        int decimal =BinDec(bin); 
        System.out.println(decimal);
    }
}
