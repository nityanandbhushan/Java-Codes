package chapterString;

public class CharAt {  

     public static boolean ChekingPallindrome( String Name){ 
             for (int i = 0; i < Name.length() / 2; i++) {
            if (Name.charAt(i) != Name.charAt(Name.length() - i-1)) {
                return false;
                
            }

        }
        return true;
    }
    public static void main(String args[]) {

        String str = "racecar"; 
        System.out.print(ChekingPallindrome(str));
       
    }

}
