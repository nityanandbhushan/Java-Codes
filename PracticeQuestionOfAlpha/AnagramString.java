package PracticeQuestionOfAlpha;
import java.util.Arrays;
import chapters.chapter3.chapter_4.chapter__5.Reverse;
import chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.reverseArr;

public class AnagramString {  
    public static void anagram(String str,String str1){  
        str=str.toLowerCase(); 
    str1=str1.toLowerCase(); 
    char arry[]=str.toCharArray(); 
    char arry1[]=str1.toCharArray();  
    Arrays.sort(arry); 
    Arrays.sort(arry1);
    if(arry.length==arry1.length){  
        boolean result=Arrays.equals(arry,arry1); 
        if(result){ 
            System.out.print("Enter String is Anagram");
        } 
        else{ 
            System.out.print("Enter String is not Anagram");
        }

    }

    }
    public static void main(String args[]){ 
    String str="race"; 
    String str1=("care");  
    anagram(str, str1); 
    

    }
    
}
