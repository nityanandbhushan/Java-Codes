package RecursionPractice;

public class SumOfNatur { 
    public static void  printNatural(int n){  
        int sum=0;
       if(n==0){ 
        System.out.print(sum);
       }  
       sum=sum+n;
       printNatural(n-1);   




    }
    public static void main(String args[]){ 
        int n=5;  
        printNatural(n);

    }
}
