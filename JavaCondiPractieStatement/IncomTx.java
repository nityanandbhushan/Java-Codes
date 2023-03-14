package JavaCondiPractieStatement;
import java.util.*;
public class IncomTx { 
    public static void main(String args[]){ 
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the Annual Salary");
        int annu =sc.nextInt(); 
        if(annu<500000){ 
            System.out.println("The tax is 0 %"); 
        } 
        else if(annu>=500000 && annu<=1000000){ 
            System.out.println("The tax is 20 %"); 
        } 
        else 
        { 
            System.out.println("The tax is 30 %");
        }
    } 
    
}
