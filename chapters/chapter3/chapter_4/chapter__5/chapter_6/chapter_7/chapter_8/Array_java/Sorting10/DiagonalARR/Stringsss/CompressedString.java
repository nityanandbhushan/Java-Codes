package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10.DiagonalARR.Stringsss;
import java.lang.StringBuffer; 
import java.lang.StringBuilder;
public class CompressedString { 
    public static String compressedstring(String str){ 
        StringBuilder sb=new StringBuilder("");  
        for(int i=0;i<str.length();i++){
            //here type of count will be Integer because in the string not exit int type volue(object) so converting only object value in string so that why cont type become Integer
            Integer count=1;  
            //int j=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){ 
                count++;  
                i++;
            } 
            sb.append(i); 
            if(count>1) 
            { 
                sb.append(count.toString());
            }
        }  
        return sb.toString();


    }
    public static void main(String args[]){ 
        String str="aaabbbbccccc";  
        System.out.print(compressedstring(str));

    }
    
}
