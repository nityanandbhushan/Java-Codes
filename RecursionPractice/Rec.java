package RecursionPractice;

public class Rec {
     public static void printDigit(int n,String arr[]){ 
        if(n<0){ 
            return;
        }  
        int num=n%10;
        System.out.print(arr[num]); 
        n=n/10; 
        printDigit(n, arr);
            
        }
    public static void main(){ 
        int n=412;
        String arr[]={"one","two","three","four","five","six","seven","eight","nine"};  
        printDigit(n,arr);


    }
    
  
}
