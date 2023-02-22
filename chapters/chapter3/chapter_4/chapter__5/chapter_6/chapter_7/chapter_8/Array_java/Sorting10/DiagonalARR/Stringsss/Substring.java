package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10.DiagonalARR.Stringsss;

public class Substring { 
    public static String printing_substring(String str ,int si,int ei){ 
        String substring=new String(""); 
        for(int i=si;i<ei;i++)
        { 
            substring=substring+str.charAt(i); 

        } 
        // for(int i=0;i<substring.length();i++) 
        // {
        //     System.out.print(substring.charAt(i));
        // } 
        return substring; 
         


    } 
    public static void main(String args[]){ 
        String str="Hellow world"; 
        int si=0,ei=5;
        System.out.print(printing_substring(str,si,ei));

    }
    
}
