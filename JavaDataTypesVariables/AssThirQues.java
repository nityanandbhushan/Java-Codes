/*Question3:
Entercostof3itemsfromtheuser(usingfloatdatatype)-apencil,apenandan eraser. 
You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
*/
package JavaDataTypesVariables;
import java.util.*;
public class AssThirQues {
    public static void main(String args[]){   
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the price of Pencil"); 
        float Pencil=sc.nextFloat(); 
        System.out.println("enter the price of Eraser"); 
        float Eraser=sc.nextFloat(); 
        System.out.println("Enter the price of Pen"); 
        float Pen=sc.nextFloat();
        float totcost= Pencil+Eraser+Pen; 
        System.out.println("Total cost of three item is :"+ totcost); 
        float gst=(totcost*18)/100; 
        System.out.println("Total Tax price  with 18 %  on Actaul price "+ gst);   
        float actpirc=totcost+gst;
        System.out.println("Final price of the items with the gst tax "+ actpirc);



    }
}
