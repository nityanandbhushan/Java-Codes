package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8;

public class zeroOne {  
    public static void zero(int n){  
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=i;j++){ 
                if((i+j)%2==0){ 
                    System.out.print(1);
                } 
                else 
              { 
                System.out.print(0);

              }
            } 
            System.out.println(" ");
        }

    }
    public static void main(String args[]){   
        int x=5;
        zero(x);

    }
    
}
