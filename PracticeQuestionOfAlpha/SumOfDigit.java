package PracticeQuestionOfAlpha;

public class SumOfDigit { 
    public static void sumOfDigit(int n,int dig){ 
        int sum=0; 
        while(n>0){ 
            int lastDig=n%10; 
            sum+=lastDig; 
            n=n/10;

        }
            

        System.out.print(sum);
     

    }
    public static void main(String args[]){ 
        sumOfDigit(123987654,9); 

    }
    
}
