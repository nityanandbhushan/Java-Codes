package JavaLoopsPractice;
import java.util.*;
public class BreakStmnt {
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
