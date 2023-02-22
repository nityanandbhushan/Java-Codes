package BitManuplation;

public class CheckEvenOdd { 
    public static void IsEvenOdd(int n){ 
        int maskbit=6&1; 
        if(maskbit==0){ 
            System.out.println("Given Number is Even");
        }  
        else{ 
            System.out.println("Given Number is Odd");
        }


    } 
    public static void main(String args[]){ 
        int n=6; 
        IsEvenOdd(n); 


    }
    
}
