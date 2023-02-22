package chapters.chapter3.chapter_4;
import java.util.*;
public class Break1 { 
    public static void main(String args[]){   
        Scanner sc = new Scanner(System.in);
        int n=7;
        for(int i=0;i<=n;i++){  
            System.out.println("enter the number");  
            int x=sc.nextInt(); 
            if(x%10==0){ 
                break;
            } 
            System.out.print(x);

        }
    }
    
}
