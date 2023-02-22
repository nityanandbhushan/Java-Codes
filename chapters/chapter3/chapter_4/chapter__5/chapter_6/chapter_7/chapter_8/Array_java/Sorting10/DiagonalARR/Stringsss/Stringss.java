package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.Sorting10.DiagonalARR.Stringsss;

public class Stringss {
    public static boolean isPallindrome(String str)
    { 
        for(int i=0;i<str.length()/2;i++){  
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            {  
                System.out.println("String is not pallindrome"); 
                return false;

            }

        } 
        System.out.println("String is pallindrome"); 
        return true;
        }

    public static void main(String args[])
    { 
        String str="racecar"; 
        isPallindrome(str);

    }
    
}
