package RecursionPractice;

public class PrintIncNumb { 
       public static void printNumbr(int n){ 
        if(n==1){  

            System.out.print(n+" "); 
            return;
        }  
        printNumbr(n-1);
        System.out.print(n + " ");

          
       }
    public static void main(String args[]){ 
        int n=10;  
        printNumbr(n);

    }
}
