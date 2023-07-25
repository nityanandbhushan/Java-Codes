package chapterString;
import java.util.*;
public class Toggle {
    public static void main(String args[]){  
        String str="PhYsIcS";  
        StringBuilder sb=new 
        // System.out.println(str); 
        System.out.println(str);   
        String str1="";
        // int a=97; 
        // str1=str1+(char)a;
        // System.out.println(str1);  
        // int b=98; 
        // str1=str1+(char)b;
        // System.out.println(str1); 
        // System.out.print(str);
        for(int i=0;i<str.length();i++){ 
            int c=(int)str.charAt(i);
            if(c>=97){ 
                c-=32; 
                str1=str1+(char)c; 

            } 
            else{ 
                c+=32; 
                str1=str1+(char)c;
            }
            

        }   
        System.out.println(str1);


}

        

        
}
