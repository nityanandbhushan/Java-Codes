 /* 
  * Question 4:What will be the type of result in the following Java code?
  */
package JavaDataTypesVariables;

public class AssFourQues { 
    public static void main(String nitya[]){  
        byte b=4; 
        char c='a'; 
        short s =512; 
        int i=1000; 
        float f=3.14f; 
        double d=99.9954; 
        //double result=((int)f*b)+(i%(int)c)-(d*s);  
        double result=(f*b)+(i%c)-(d*s); 
        System.out.println("The result is "+ result);

    }
    
}
