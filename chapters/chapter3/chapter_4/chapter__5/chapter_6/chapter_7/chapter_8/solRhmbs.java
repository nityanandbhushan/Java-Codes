package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8;

public class solRhmbs {
    public static void solid_rhombos(int n){ 
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=(n-i);j++){ 
                System.out.print(" ");
            } 
            for(int j=1;j<=n;j++){ 
                System.out.print("*");
            } 
            System.out.println(" ");
        } 

    } 
    public static void main(String args[]){ 
        int n=5; 
        solid_rhombos(n);

    }
   
    
}
