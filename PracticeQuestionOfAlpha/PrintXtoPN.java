package PracticeQuestionOfAlpha;

public class PrintXtoPN { 
    public static int printingPowerofn(int x,int n){  
        if(n==0){ 
            return 1;
        } 
        int xm1=printingPowerofn(x, n-1); 
        int fun=x*xm1; 
        return fun;



    }
   public static void main(String args[]){ 
    int x=2;
    int n=10; 
   System.out.print(printingPowerofn(x, n));


   } 
}
