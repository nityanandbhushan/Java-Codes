package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8;

public class diamOnd {
    public static void diamond_pattern(int n){ 
         for(int i=1;i<=n;i++) 
         { 
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" "); 

            } 
            for(int j=1;j<=(2*i-1);j++)
            { 
              System.out.print("*");
            }  

            System.out.println(" ");  
         }  
         for(int i=n;i>=1;i--){  
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" "); 

            } 
            for(int j=1;j<=(2*i-1);j++)
            { 
              System.out.print("*");
            }  

            System.out.println(" ");

         }


    }
    public static void main(String args[]){  
        diamond_pattern(4);

    }
    
}
