package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10.DiagonalARR.Stringsss;
import java.util.*; 
import java.lang.StringBuffer;
import java.util.concurrent.LinkedBlockingQueue; 
public class ToUppercase { 
    public static String printing(String str){ 
        StringBuffer sb= new StringBuffer("");
        char ch =Character.toUpperCase(str.charAt(0));  
        sb.append(ch);
        for(int i=1;i<str.length();i++){ 
            if(str.charAt(i) ==''&& str.length()-1){ 
                sb.append(str.charAt(i)); 
                i++; 
                sb.append(Character.toUpperCase(str.charAt(i)));
            } 
            return sb.toString(); 


    }  
    System.out.print(sb);
}
    public static void main(String args[]) 
    { 
        String str ="hi, my name is nityanand";  
        System.out.println(printing(str)); 
      
        } 


    
}
