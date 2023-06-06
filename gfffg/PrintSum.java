package gfffg;

public class PrintSum { 
    public static int printSum(int n){   
      int sum=0;
      if(n<1){
        return 0;
      } 
      printSum(n-1);
       sum+=n; 
      return sum;

    }
    public static void main(String args[]){ 
        int n=5;  
        System.out.print(printSum(n));


    }
}
