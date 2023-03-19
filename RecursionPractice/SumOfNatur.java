package RecursionPractice;

public class SumOfNatur { 
    public static int  printNatural(int n){  
        //int sum=0;
       if(n==0){ 
        return 0; 
            
       }   
       int sums=printNatural(n-1); 
       int sum=n+sums;  
       return sum;
    }
    public static void main(String args[]){ 
        int n=5;  
        System.out.print(printNatural(n));

    }
}
