/* 
 * Question 2 :Swap two numbers without using any third variable??
 */
package BitmanupulationAssignment;
public class AssScoQues {  
    public static void swapingTeq(int a,int b){  
        a=a^b; 
        b=a^b; 
        a=a^b; 
        System.out.print("value of a"+a+ ","+ "value of b" +b);

    }
    public static void main(String args[]){  
        int a=8; 
        int b=4;  

        swapingTeq(a,b);
    }
   
    
}
