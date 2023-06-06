package chapterString;
import java.lang.String;

public class StringChapter {
    public static void main(String args[]){ 
        String firstN="Nitya"; 
        String middleN="Nand";
        String lastN="Bhushan";
        String fullN=firstN+middleN+lastN;
        System.out.println(fullN.charAt(0)); 
        for(int i=0;i<fullN.length();i++)
        {  
            System.out.print(fullN.charAt(i));
        
        }
    } 
    
}
