package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;
import java.util.*;
public class BinDeci {

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
