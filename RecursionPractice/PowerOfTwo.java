package RecursionPractice;

public class PowerOfTwo { 
    public static int printinXtothePower(int x,int n){  
        if(n==0){ 
            return 1;
        } 
        int nm1=printinXtothePower(x,n-1);
        int poftwo=x*nm1;  
        return poftwo;


    }
    public static void main(String args[]){ 
        int x=2;
        int n=10;  
        System.out.print(printinXtothePower(x, n));

    }
}
