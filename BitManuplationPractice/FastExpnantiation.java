package BitManuplationPractice;

public class FastExpnantiation { 
    public static int fastExpnantiation(int n,int sqr){ 
       int ans=1;
        while(n>0){ 
        if((n&1)!=0){ 
            ans=ans*n; 


        }  
        n=n*n;
        n=n>>1; 


       } 
       return ans;
    }
    public static void main(String args[]){ 
        int num=5; 
        int sqr=3;
    }
    
}
