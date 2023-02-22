package chapters;
import java.util.*;
public class que3 { 
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
