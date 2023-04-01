package RecursionPractice;

public class TillProb {
    public static int printWays(int n){  
        if(n==1 && n==0){ 
            return 1;
        } 
        int nm1=printWays(n-1);
        int nm2=printWays(n-2);
        int ways=nm1+nm2; 
        return ways;

    }
    public static void main(String args[]){ 
        int n=4; 
       System.out.print(printWays(n));

    }
}
