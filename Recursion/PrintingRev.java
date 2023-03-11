package Recursion;

public class PrintingRev {  
    public static void printingRev(int n,int start){   
        if(n==10){ 
            System.out.print(n); 
            return;
        }
        System.out.print(n); 
       // printingRev(n);

    }
    public static void main(String args[]){  
        int n=10,start=1; 
        printingRev(n,start);

    }
    
}
