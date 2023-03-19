package RecursionPractice;

import chapters.chapter3.chapter_4.chapter__5.chapter_6.chapter_7.chapter_8.Array_java.prifixMax;

public class PrintFact { 
    public static int printFact(int n){  
        if(n==0){ 
            return 1;
        }  
         int nm1=printFact(n-1); 
         System.out.println(n);
         int fact=n*nm1;
         return fact; 

    } 
   public static void main(String args[]){ 
    int n=5;  
    System.out.print(printFact(n));  



   }
}
