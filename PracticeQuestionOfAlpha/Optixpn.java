package PracticeQuestionOfAlpha;

public class Optixpn { 
    public static int printXpton(int x,int n){ 
        if(n==0){ 
            return 1;
        } 
        int nm1=printXpton(x, n/2); 
        int fn=nm1*nm1; 
        if(n%2!=0){ 
            fn=x*f n;
        } 
        return fn;

    }
    public static void main(String args[]){ 
        int x=2;
        int n=10; 
        System.out.print(printXpton(x, n));
    }
}
