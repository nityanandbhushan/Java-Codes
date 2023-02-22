package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10.DiagonalARR.Stringsss;

public class PrintingS { 
    public static void printing_string(String fullName){ 
        for(int i=0;i<fullName.length();i++){ 
            System.out.print(fullName.charAt(i)+" ");
        } 
    } 
    public static void main(String args[]){ 
        String firstName="Nitya";  
        String lastName="Nand Bhushan"; 
        String fullName=firstName+" "+lastName; 
        printing_string(fullName); 


    }
    
}
