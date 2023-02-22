package chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7;
import java.util.*;
public class funMe2 { 
    public static int Sum(int a,int b){  
        int sum=a+b; 
        return sum;
    }
    public static void main(String args[]){   
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the two numbers"); 
        int a=sc.nextInt(); 
        int b=sc.nextInt();
        int Add=Sum(a,b); 
        System.out.println(Add);

    }
}
