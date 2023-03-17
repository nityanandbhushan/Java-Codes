package AdvancePattPractice;
import java.util.*;
public class HollowRect {
    public static void holloRectangle(int row,int col){ 
        for(int i=1;i<=row;i++)
        { 
            for(int j=1;j<=col;j++)
            {  
                if(i==1 || i==row || j==1 || j==col){ 
                    System.out.print("*");
                } 
                else 
                { 
                    System.out.print(" ");
                }
            } 
            System.out.println(" ");
        }
    }
    public static void main(String args[]){  
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter the row of the matrix"); 
        int row=sc.nextInt(); 
        System.out.println("Enter the coloumn of the Matrix"); 
        int col=sc.nextInt(); 
        holloRectangle(row,col);
    }
}
