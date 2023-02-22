package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8;

public class halfPyr { 
    public static void halfpyr(int n){ 
        for(int i=1;i<=n;i++){ 
            for(int j=1;j<=n-i;j++){ 
                System.out.print(" ");
            } 
            for(int k=1;k<=i;k++){ 
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){    
        halfpyr(4);

    }
}
