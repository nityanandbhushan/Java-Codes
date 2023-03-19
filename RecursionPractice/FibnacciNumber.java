package RecursionPractice;

public class FibnacciNumber {
    public static int printFibonacci(int n){ 
      if(n==0||n==1){ 
        return n;

      } 
      //printFibonacci(n-1); 
      int fnm1=printFibonacci(n-1); 
      int fnm2=printFibonacci(n-2); 
      int fn=fnm1+fnm2; 
      return fn;
    }
    public static void main(String args[]){ 
        int n=5; 
        printFibonacci(n);  
        


    }
    
}
