package gfffg;

import java.math.BigInteger;

public class Rmein {
    public static void printRemainder(String s){ 
        int sum=0; 

        for(int i=0;i<s.length();i++){ 
              
           sum+=Character.getNumericValue(s.charAt(i));
        
        } 
        int  remin=sum%11; 
        System.out.print(sum);
        System.out.print(remin);


    }
    public static void main(String args[]){ 
        String s="845738758358928547"; 
        printRemainder(s);

    }
}
