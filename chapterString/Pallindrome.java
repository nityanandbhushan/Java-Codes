package chapterString;
import java.lang.String;
public class Pallindrome {
    public static void main(String args[]){  
        String str="noona"; 
        int limit=str.length()/2;
        int j=str.length()-1;
        for(int i=0;i<limit;i++)
        { 
            if(str.charAt(i)!=str.charAt(limit-i))
            { 
                System.out.print("Not Pallindrome");
                break;
            }  
            j--;


        } 
        System.out.print("String is pallindrome");
        
    }
}
