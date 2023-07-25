package BitmanupulationAssignment;
import java.util.*;

public class Bit { 
    public static void findoddeven(int n){
        int maskbit=n&1;
        if(maskbit==0){ 
            System.out.print("This is Even Number");
        }  
        else{ 
            System.out.print("This is Odd Number");
        }

    }
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int n=sc.nextInt();
        findoddeven(n);

    
    }
    
}
