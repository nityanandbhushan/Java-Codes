package chapters.chapter3.chapter_4.chapter__5.chapter_6;

public class CharPatt {
    public static void main(String args[]){  
        char ch ='A';
        for(int line=1;line<=4;line++){ 
            for(int star=1;star<=line;star++){ 
                System.out.print(ch);  
                ch++;

            } 
            System.out.println(" ");
        }
    }
}
