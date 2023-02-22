package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;
import java.util.*;
public class pq1 { 
    public static void pyqAverage(int a,int b,int c){ 
        float avg = (a+b+c)/3; 
        System.out.println("The average of three numbers is"+avg);
    }
    public static void main(String args[]){  
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the three numbers"); 
        int a =sc.nextInt(); 
        int b =sc.nextInt(); 
        int c =sc.nextInt();
        pyqAverage(a,b,c);
    }
}
