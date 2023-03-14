package JavaCondiPractieStatement;
import java.util.*;
public class PasFail {
    public static void main(String args[]){  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the percentage of Student");
        int perc=sc.nextInt(); 
        if(perc>=33){ 
            System.out.println("Student is Pass");
        }  
        else 
        { 
            System.out.println("Student is Fail");
        }
     } 
}
