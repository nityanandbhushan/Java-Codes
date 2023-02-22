package chapters.chapter3.chapter_4;
import java.util.Scanner;
public class While2 {
    public static void main(String args[]){  
        Scanner sc=new Scanner(System.in);  
        int i=0;
        System.out.println("enter the value where you want to print the number");  
        int n=sc.nextInt(); 
        while(i<=n){ 
            System.out.println(i); 
            i++;
        }
    
    }
}
