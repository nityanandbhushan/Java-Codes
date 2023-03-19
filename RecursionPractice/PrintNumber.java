package RecursionPractice;

public class PrintNumber {  
    public static void printingNumber(int n){  
        if(n==0){ 
            return;
        } 
        System.out.println(n); 
        printingNumber(n-1); 
        System.out.println(n);

    }
    public static void main(String args[]){ 
        int n=5; 
        printingNumber(n);

    }
    
}
