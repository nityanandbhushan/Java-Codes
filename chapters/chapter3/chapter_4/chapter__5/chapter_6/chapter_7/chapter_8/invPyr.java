package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8;

public class invPyr {
    public static void inv_half_pyrmd(int n){ 
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=n-i+1;j++){  
                System.out.print( j );

            } 
            System.out.println(" ");
        }
    } 
    public static void main(String args[]){  
        inv_half_pyrmd(5);
        
 
    }
    
}
