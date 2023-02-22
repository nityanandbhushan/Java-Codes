package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;
import java.util.*;
public class Swap  
{ 
    public static void swap(int a,int b)
    { 
        int temp=0; 
        temp=a; 
        a=b; 
        b=temp;  
        System.out.println("Value of A & B After the Swapping" +  a  + b);
}
    /**
     * @param args
     */
    public static void main(String args[])
    {  
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two numbers"); 
        int a=sc.nextInt(); 
        int b=sc.nextInt();  
        System.out.println("Value of A & B Before the Swapping" +  a  + b);
        swap(a,b);

    }
}
