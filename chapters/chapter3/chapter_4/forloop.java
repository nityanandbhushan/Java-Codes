package chapters.chapter3.chapter_4;
import java.util.*;
public class forloop { 
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in); 
        System.out.println("ENTER THE VALUE OF 4 DIGIT"); 
        int n=sc.nextInt();
        for(int i=0;i<n;i++){  
            int lastdigit=n%10; 
            System.out.print(lastdigit); 
            n=n/10; 


        }
    }
    
}
