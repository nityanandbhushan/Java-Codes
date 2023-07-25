package RecursionPractice;

public class FibnacciNumber {
    public static int printFibonacci(int n)
    {      
      if(n==0){ 
        return 1;
      } 
      int chhotakaam=printFibonacci(n-1);
      int badakam=2*chhotakaam;
      return badakam;

    }
    public static void main(String args[])
    { 
      int n=5;
      System.out.print(printFibonacci(n));
     
    }   
}
