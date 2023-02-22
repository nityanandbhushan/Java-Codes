package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;
import java.util.*;
public class deciToBin {  
    public static int deciBin(int deci) 
    {  
        int bin=0;  
        int pow=0;
        while(deci >0)
        {   
            int rem = deci % 2; 
            bin=bin+(rem * (int)Math.pow(10, pow)); 
            pow++; 
            deci=deci/2;

        } 
        return bin;

    }
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in); 
    int deci=sc.nextInt(); 
    int decimal=deciBin(deci);  
    System.out.println(decimal); 
}
    
}
