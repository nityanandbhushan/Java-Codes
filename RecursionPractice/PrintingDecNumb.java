package RecursionPractice;

public class PrintingDecNumb {  
    public static void printingRev(int n){   
        if(n==1){ 
            System.out.print(n); 
            return;
        }
        System.out.print(n); 
        printingRev(n-1);

    }
    public static void main(String args[]){  
        int n=10;
        printingRev(n);

    }
    
}
