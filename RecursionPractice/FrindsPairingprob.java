package RecursionPractice;

public class FrindsPairingprob { 
    public static int solvingProb(int n){
        if(n==1 || n==2){ 
            return n;
        }  
        // int fnm1=solvingProb(n-1);
        // int fnm2=solvingProb(n-2); 
        // int pairways=(n-1)*fnm2; 
        // int totalpairs=pairways+fnm1; 
        // return totalpairs; 
        return solvingProb(n-1)+(n-1)*solvingProb(n-2);

    }
    public static void main(String args[]){ 
        int n=3; 
        System.out.print(solvingProb(n));

    }
}
