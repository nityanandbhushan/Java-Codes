/* 
Question3: 
WriteaJavaprogramtoinputweeknumber(1-7)andprintdayofweeknameusing switch case 
*/
package JavaConditionStatement;

import java.util.*;

public class AssThirdQues { 
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in); 
        int number=sc.nextInt();
        switch(number){ 
            case 1: System.out.println("MONDAY"); 
            break; 
            case 2: System.out.println("TUESDAY"); 
            break; 
            case 3: System.out.println("WEDNESDAY"); 
            break; 
            case 4: System.out.println("THURSDAY"); 
            break; 
            case 5: System.out.println("FRIDAY"); 
            break; 
            case 6: System.out.println("SATURDAY"); 
            break; 
            case 7: System.out.println("SUNDAY"); 
            default: System.out.println("You print the out of range number");
        }
    
        }

}
